package org.xoxo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.xoxo.DTO.Person;
import org.xoxo.Service.IService;

import java.util.List;

@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(QuizController.class);
    private final IService iService;

    @Autowired
    public HomeController(IService iService) {
        this.iService = iService;
    }

    @RequestMapping(value = "insert")
    public String insert() {
        return "insert";
    }

    @RequestMapping(value = "selectAll")
    public String selectAll(Model model) {
        List<Person> personList = iService.selectAll();
        model.addAttribute("personList", personList);
        return "select";
    }

    @RequestMapping(value = "selectPart")
    public String selectPart(@RequestParam("id") String id, Model model) {
        Person person = iService.selectPart(id);
        model.addAttribute("person", person);
        return "select";
    }

    @RequestMapping(value = "insertProc")
    public String insertProc(Person person) {
        logger.warn(person.getFirstName());
        iService.insertProc(person);
        return "insert";
    }

    @RequestMapping(value = "modify")
    public String modify(Person person, Model model) {
        model.addAttribute("person", person);
        return "modify";
    }

    @RequestMapping(value = "modifyProc")
    public String modifyProc(Person person) {
        iService.modifyProc(person);
        return "redirect:selectAll";
    }

    @RequestMapping(value = "deleteProc")
    public String deleteProc(@RequestParam("id") String id) {
        iService.deleteProc(id);
        return "redirect:selectAll";
    }

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
