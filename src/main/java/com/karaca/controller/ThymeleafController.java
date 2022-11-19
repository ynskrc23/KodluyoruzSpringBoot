package com.karaca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8086/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1(){
        return "thymeleaf1";
    }

    //http://localhost:8086/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model){
        model.addAttribute("key_model1","ben model 1'den geldim");
        model.addAttribute("key_model2","ben model 2'den geldim");
        return "thymeleaf1";
    }

    //http://localhost:8086/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model){
        model.addAttribute("key_model1","ben model 1'den geldim");
        model.addAttribute("key_model2","ben model 2'den geldim");
        return "tyhmeleaf_file/thymeleaf3";
    }
}
