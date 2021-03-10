package com.sumon.xyz.SpringBootThymeleafForm.controller;

import com.sumon.xyz.SpringBootThymeleafForm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/register")
    public String ShowForm(Model model)
    {
        User user = new User();
        model.addAttribute("user",user);

        List professionList = Arrays.asList("Developer","Designer","Software Engineer");
        model.addAttribute("professionList",professionList);

        return "register_form";
    }



    @PostMapping("/register")
    public String SubmitForm(@ModelAttribute("user") User user)
    {
        System.out.println(user);
        return "register_success";
    }

}
