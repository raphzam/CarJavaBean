package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/carform")
    public String loadCarForm(Model model){
        model.addAttribute("car", new Car());
        return "carform";
    }

    @PostMapping("/carform")
    public String loadFromCarForm(@ModelAttribute Car car , Model model){
        model.addAttribute("car", car);
        return "confirmation";
    }

}
