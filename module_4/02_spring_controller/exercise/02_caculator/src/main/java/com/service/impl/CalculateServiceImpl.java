package com.service.impl;

import com.service.ICalculate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CalculateServiceImpl implements ICalculate {
    @Override
    public String calculate(Map<String, String> map, String operator) {
        String result = "";
        try {


        int num1 = Integer.parseInt(map.get("num1"));
        int num2 = Integer.parseInt(map.get("num2"));
        operator = map.get("operator");


        switch (operator) {
            case "+":
                result = Integer.toString(num1 + num2);
                operator = "+";
                break;
            case "-":
                result = Integer.toString(num1 - num2);
                operator = "-";
                break;
            case "*":
                result = Integer.toString(num1 * num2);
                operator = "*";
                break;
            case "/":
                if (num2 == 0) {
                    result = " pls input number 2 != 0 ";
                    break;
                } else {
                    result = Integer.toString(num1 / num2);
                    operator = "/";
                    break;
                }

            default:
                break;
        }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }

        return result;
    }
}
