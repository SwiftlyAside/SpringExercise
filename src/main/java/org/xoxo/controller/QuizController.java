package org.xoxo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class QuizController {
    private Map<String, String> map;

    public QuizController() {
        map = new HashMap<>();

        map.put("login", "member/");
        map.put("myPage", "member/");
        map.put("email", "member/");

        map.put("intro", "seoul/");
        map.put("join", "seoul/");
    }

    private static final Logger logger = LoggerFactory.getLogger(QuizController.class);

    @RequestMapping(value = "homeSample")
    public String home() {
        logger.info(new Date().toString());
        return "home";
    }

    @RequestMapping(value = "{pathName}")
    public String homeSample(@PathVariable String pathName) {
        return pathName.equals("home") ? "homeSample" : map.get(pathName) + pathName;
    }

    @RequestMapping(value = "loginForm")
    public String loginForm(@RequestParam Map<String, String> param, Model model) {
        model.addAttribute("userId", param.get("userId"));
        model.addAttribute("userPass", param.get("userPass"));
        return "form/loginForm";
    }
}
