package btech.controller;

import btech.model.concrete.Repair;
import btech.service.HelpDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {

    private final HelpDeskService helpDeskService;

    @Autowired
    public IndexController(HelpDeskService helpDeskService) {
        this.helpDeskService = helpDeskService;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Repair> openRepairs = helpDeskService.getOpenRepairs();
        model.addAttribute("openRepairs", openRepairs);
        return "index";
    }
}
