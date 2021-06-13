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
    public String exchange(@RequestParam String input, Model model) {
        String[] vn = {"xin chao", "tam biet", "cam on"};
        String[] engl = {"Hello", "Good bye", "Thank you"};

//        int index = 0;
//        boolean check=false;
        String result=null;
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
//
//        for (int i = 0; i < 3; i++) {
//            if (input.equals(engl[i])) {
//                result=vn[i];
//                break;
//            }else  if (input.equals(vn[i])){
//                result=engl[i];
//                break;
//            }else  {
//                result="ko tim thay";
//            }
//        }

//        for (int i = 0; i < vn.length; i++) {
//            if (input.equals(vn[i])) {
//                index = i;
//                result=engl[index];
//                break;
//            }
//        }

        model.addAttribute("result", result);


        return "/home";
    }
}
