package com.service.impl;

import com.service.IDictionaryService;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Override
    public String translate(String input) {
        String[] vn = {"xin chào", "tạm biệt", "cảm ơn"};
        String[] engl = {"hello", "good bye", "thank you"};
        String result = null;
        input=input.toLowerCase();

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
        return result;
    }
}
