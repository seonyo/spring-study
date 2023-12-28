package hello.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloControler {
    @GetMapping
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }
}
