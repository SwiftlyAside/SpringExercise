package org.xoxo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Locale;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "third", method = RequestMethod.GET)
    public String home() {
        return "third/home";
    }

    @RequestMapping(value = "authForm")
    public String authForm() {
        return "third/authForm";
    }

    @RequestMapping(value = "authProc")
    public String authProc(@RequestParam String email, Model model) {
        logger.info(email);
        model.addAttribute("authNum", String.format("%06d", (int) (Math.random() * 100000)));
        return "third/home";
    }
}
