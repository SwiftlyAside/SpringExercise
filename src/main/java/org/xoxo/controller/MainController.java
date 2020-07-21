package org.xoxo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String test(Model model) {
        model.addAttribute("msg", "Hello Baby");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/man")
    public String man() {
        return "C'mon, Let's go!";
    }
}