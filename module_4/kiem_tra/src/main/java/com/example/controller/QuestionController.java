package com.example.controller;

import com.example.model.dto.QuestionDto;
import com.example.model.entity.Question;
import com.example.model.entity.QuestionType;
import com.example.model.service.IQuestionService;
import com.example.model.service.IQuestionTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"questions"})
public class QuestionController {
    @Autowired
    private IQuestionService questionService;
    @Autowired
    private IQuestionTypeService questionTypeService;

    @ModelAttribute(value = "questionTypes")
    public Iterable<QuestionType> questionTypes() {
        return questionTypeService.findAll();
    }


    @GetMapping(value = {"/create-question"})
    public ModelAndView showCreateQuestion() {
        QuestionDto questionDto = new QuestionDto();
        ModelAndView modelAndView = new ModelAndView("/question/create");
        modelAndView.addObject("questionDto", questionDto);
        return modelAndView;
    }

    @PostMapping(value = "/create-question")
    public ModelAndView saveQuestion(@Validated @ModelAttribute QuestionDto questionDto, BindingResult bindingResult) {
        Question question = new Question();
        BeanUtils.copyProperties(questionDto, question);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("/question/create");
            modelAndView.addAllObjects(bindingResult.getModel());
            return modelAndView;
        } else {
            questionService.save(question);
            ModelAndView modelAndView = new ModelAndView("/question/create");
            modelAndView.addObject("question", question);
            modelAndView.addObject("mes", "new question created successfully");
            return modelAndView;
        }
    }

    @GetMapping(value = "/questions")
    public ModelAndView listQuestion(@RequestParam("title") Optional<String> title,
                                     @RequestParam("questionType") Optional<String> questionType,
                                     @PageableDefault(value = 2) Pageable pageable) {
        Page<Question> questions;
        ModelAndView modelAndView = new ModelAndView("question/list");
        questions = questionService.findByQuestionContaining(title.orElse(""), questionType.orElse(""), pageable);
        modelAndView.addObject("title", title.orElse(""));
        modelAndView.addObject("questionType", questionType.orElse(""));
        modelAndView.addObject("questions", questions);
        return modelAndView;
    }

    @GetMapping(value = "/edit-question/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Optional<Question> question = questionService.findById(id);

        QuestionDto questionDto = new QuestionDto();
        BeanUtils.copyProperties(question.get(), questionDto);
        if (question.isPresent()) {
            ModelAndView modelAndView = new ModelAndView("/question/edit");
            modelAndView.addObject("questionDto", questionDto);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error");
            return modelAndView;
        }
    }

    @PostMapping(value = "/edit-question")
    public ModelAndView updateQuestion(@Validated @ModelAttribute QuestionDto questionDto,
                                       BindingResult bindingResult) {
        Question question = new Question();
        BeanUtils.copyProperties(questionDto, question);
        if (bindingResult.hasErrors()) {
            ModelAndView modelAndView = new ModelAndView("question/edit");
            return modelAndView;
        } else {
            questionService.save(question);
            ModelAndView modelAndView = new ModelAndView("question/edit");
            modelAndView.addObject("question", question);
            modelAndView.addObject("mes", "question update successfully");
            return modelAndView;
        }

    }

    @GetMapping(value = "/delete-question")
    public String deleteQuestion(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        Optional<Question> question = questionService.findById(id);
        if (question.isPresent()) {
            return "/error";
        }
        questionService.remove(id);
        redirectAttributes.addFlashAttribute("mes", "deleted successfully! ");
        return "redirect:questions";
    }
}
