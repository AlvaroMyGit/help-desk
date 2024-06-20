package btech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientChoiceController {

    @GetMapping("/choose-client")
    public String showChooseClientForm() {
        return "choose-client";
    }

    @PostMapping("/choose-client")
    public String processClientChoice(String clientType) {
        if ("existing".equals(clientType)) {
            return "redirect:/existing-client";
        } else if ("new".equals(clientType)) {
            return "redirect:/new-client";
        } else {
            // Handle invalid choice scenario
            return "redirect:/choose-client"; // Redirect back to choose-client form
        }
    }
}
