package com.unbabel.challenge.controller;

import com.unbabel.challenge.model.Message;
import com.unbabel.challenge.repository.MessageRepository;
import com.unbabel.challenge.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    MessageService messageService;

    @Value("${java.challenge.company}")
    private String company; // Reads this value from Spring properties file

    /**
     * Renders the homepage
     * @param model inject objects into thymeleaf template
     * @return generated html page using thymeleaf
     */
    @GetMapping("/")
    public String main(Model model) {
        //set variables to be used in thymeleaf template
        model.addAttribute("company", company);
        return "index"; //thymeleaf template name (index -> index.html)
    }


    /**
     * Post request for translating a given message
     *
     * @param message
     */
    @PostMapping("/")
    public String translateGivenMessage(@ModelAttribute Message message) {
        message.setSource_language("en");
        message.setText_format("text");
        messageService.translate(message);

        return "redirect:/";

    }

}
