package com.karaca.tutorials.controller;

import com.karaca.tutorials.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    //http://localhost:8086/
    @GetMapping("/")
    public String index() {
        return "index";
    }

    //http://localhost:8086/thymeleaf1
    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1() {
        return "thymeleaf1";
    }

    //http://localhost:8086/thymeleaf2
    @GetMapping("/thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "ben model 1'den geldim");
        model.addAttribute("key_model2", "ben model 2'den geldim");
        return "thymeleaf1";
    }

    //http://localhost:8086/thymeleaf3
    @GetMapping("/thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "ben model 1'den geldim");
        model.addAttribute("key_model2", "ben model 2'den geldim");
        return "tyhmeleaf_file/thymeleaf3";
    }

    //http://localhost:8086/thymeleaf4
    @GetMapping("/thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "ben model 4'den geldim");
        return "thymeleaf4";
    }

    //http://localhost:8086/thymeleaf5
    @GetMapping("/thymeleaf5")
    public String getThymeleaf5Model(Model model) {
        model.addAttribute("key_model1", "text");
        ProductDto productDto = ProductDto.builder().productId(0L).productName("Ürün adı").productPrice(2500).build();
        model.addAttribute("key_model2", productDto);
        return "thymeleaf5";
    }

    //http://localhost:8086/thymeleaf6
    @GetMapping("/thymeleaf6")
    public String getThymeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model1", "text");
        List<ProductDto> listem = new ArrayList<>();
        listem.add(ProductDto.builder().productId(1L).productName("Ürün adı 1").productPrice(1500).build());
        listem.add(ProductDto.builder().productId(2L).productName("Ürün adı 2").productPrice(2500).build());
        listem.add(ProductDto.builder().productId(3L).productName("Ürün adı 3").productPrice(3500).build());
        listem.add(ProductDto.builder().productId(4L).productName("Ürün adı 4").productPrice(4500).build());
        model.addAttribute("product_list", listem);
        return "thymeleaf6";
    }

    //http://localhost:8086/thymeleaf7/23
    @GetMapping({"/thymeleaf7", "/thymeleaf7/{id}"})
    public String getThymeleaf7ModelObjectList(Model model, @PathVariable(name = "id",required = false) Long id) {
        if(id != null){
            model.addAttribute("key_model1", "id: "+id);
        }
        else {
            model.addAttribute("key_model1", "id bulunamadı!");
        }
        return "thymeleaf7";
    }

    //http://localhost:8086/thymeleaf8?id=82
    //http://localhost:8086/thymeleaf8?id=82&name=Yunus
    @GetMapping("/thymeleaf8")
    public String getThymeleaf8ModelObjectList(Model model, @RequestParam(name = "id") Long id, @RequestParam(name = "name") String firstName) {
        model.addAttribute("key_model1", "id: "+id+ " first name: "+firstName);
        return "thymeleaf8";
    }
}
