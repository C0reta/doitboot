package com.example.doitboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String Hello() {
        return "4532";
    }
}
