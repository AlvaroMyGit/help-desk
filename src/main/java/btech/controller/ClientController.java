package btech.controller;

import btech.model.concrete.Client;
import btech.service.HelpDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private HelpDeskService helpDeskService;

    @GetMapping
    public String listClients(Model model) {
        model.addAttribute("clients", helpDeskService.getAllClients());
        return "clients";
    }

    @GetMapping("/new")
    public String showAddClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "add-client";
    }

    @PostMapping
    public String addClient(@ModelAttribute Client client) {
        helpDeskService.addClient(client);
        return "redirect:/clients";
    }

    // Other methods for update and delete
}
