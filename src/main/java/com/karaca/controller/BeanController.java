package com.karaca.controller;

import com.karaca.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {
    @Autowired
    BeanConfig beanConfig;

    //http://localhost:8086/bean/beanDto
    @GetMapping("/bean/beanDto") //url yapısı
    @ResponseBody //html olmadan ekrana basar
    public String getBeanDto(){
        return beanConfig.beanDto()+"_";
    }
}
