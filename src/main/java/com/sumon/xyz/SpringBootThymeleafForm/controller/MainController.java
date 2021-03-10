package com.sumon.xyz.SpringBootThymeleafForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/register")
    public String ShowForm()
    {
        return "register_form";
    }

}
