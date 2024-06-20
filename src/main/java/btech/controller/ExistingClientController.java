package btech.controller;

import btech.model.concrete.Client;
import btech.service.HelpDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class ExistingClientController {

    @Autowired
    private HelpDeskService helpDeskService;

    @GetMapping("/existing-client")
    public String showExistingClientForm() {
        return "existing-client";
    }

    @PostMapping("/existing-client")
    public String processExistingClient(@RequestParam Long clientId, Model model) {
        Optional<Client> client = helpDeskService.getClientById(clientId);
        if (client.isPresent()) {
            model.addAttribute("client", client);
            return "redirect:/add-repair?clientId=" + clientId;
        } else {
            model.addAttribute("error", "Client not found");
            return "existing-client";
        }
    }
}
