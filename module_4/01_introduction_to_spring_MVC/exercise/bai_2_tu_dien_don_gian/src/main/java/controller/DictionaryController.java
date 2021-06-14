package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("/")
    public String home() {
        return "/home";
    }

    @PostMapping("abc")
    public String exchange(@RequestParam String input,String result, Model model) {
        String[] vn = {"xin chào", "tạm biệt", "cảm ơn"};
        String[] engl = {"hello", "good bye", "thank you"};
//        int index = 0;
//        boolean check=false;
        input=input.toLowerCase();
//        String result=null;
        for (int i =0 ; i< vn.length; i++ ){
            if (input.equals(vn[i])){
                result=engl[i];
                break;
            }

            else if (input.equals(engl[i])){
                result=vn[i];
                break;
            }else {
                result="not found !! ";
            }
        }
        model.addAttribute("input", input);
        model.addAttribute("result", result);
        return "/home";
    }
}
