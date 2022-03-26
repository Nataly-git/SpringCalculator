package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActionController {

    @GetMapping("/calculator")
    public String getResult(@RequestParam(value="a") int a,
                            @RequestParam(value="b") int b,
                            @RequestParam(value="action") String action,
                            Model model){
        int result = 0;
        switch (action) {
            case "multiplication":
                result = multiplication(a,b);
                break;
            case "addition":
                result = addition(a,b);
                break;
            case "subtraction":
                result = subtraction(a,b);
                break;
                case "division":
                result = division(a,b);
                break;
        }
        model.addAttribute("message", result);
        return "calculator";
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int division(int a, int b) {
        return a / b;
    }

}
