package com.william.study.serviceconsumer.controller;

import com.william.study.serviceconsumer.feign.GreetingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    private GreetingClient greetingClient;

    @Autowired
    public GreetingController(GreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    @GetMapping("/get-greeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting-view";
    }
}
