package com.example.testers.Controller.View;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sys001")
public class Sys_001_View {

    @GetMapping("/")
    public String view001 (Model model){
        return "sys/sys001";
    }
}
