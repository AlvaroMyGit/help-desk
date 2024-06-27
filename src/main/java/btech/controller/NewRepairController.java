package btech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewRepairController {

    @GetMapping("/new-repair")
    public String showNewRepairForm() {
        return "new-repair";
    }
}
