package org.xoxo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class QuizController {
    private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "home")
    public String home() {
        logger.info(new Date().toString());
        return "home";
    }

    @RequestMapping(value = "login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "loginForm")
    public String loginForm(@RequestParam Map<String, String> param, Model model) {
        model.addAttribute("userId", param.get("userId"));
        model.addAttribute("userPass", param.get("userPass"));
        return "form/loginForm";
    }
}
