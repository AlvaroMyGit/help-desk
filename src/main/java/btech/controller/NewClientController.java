package btech.controller;

import btech.model.concrete.Client;
import btech.service.HelpDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewClientController {

    @Autowired
    private HelpDeskService helpDeskService;

    @GetMapping("/new-client")
    public String showNewClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "new-client";
    }

    @PostMapping("/new-client")
    public String processNewClient(@ModelAttribute Client client, Model model) {
        helpDeskService.addClient(client);
        model.addAttribute("client", client);
        return "redirect:/add-repair?clientId=" + client.getId();
    }
}
