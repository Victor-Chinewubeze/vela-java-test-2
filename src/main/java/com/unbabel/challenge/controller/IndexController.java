package com.unbabel.challenge.controller;

import com.unbabel.challenge.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    MessageRepository messageRepository;

    @Value("${java.challenge.company}")
    private String company; // Reads this value from Spring properties file

    /**
     * Accepts get requests to the "/" url, generates random messages
     * and renders them in thymeleaf template (index.html).
     * @param model inject objects into thymeleaf template
     * @return generated html page using thymeleaf
     */
    @GetMapping("/")
    public String main(Model model) {
        //set variables to be used in thymeleaf template
        model.addAttribute("company", company);
        return "index"; //thymeleaf template name (index -> index.html)
    }



}
