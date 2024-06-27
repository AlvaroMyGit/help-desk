package btech.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import btech.model.concrete.Client;
import btech.repository.ClientRepository;

@Controller
public class ExistingClientController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/find-client")
    public String findClientByEmail(@RequestParam("email") String email, Model model) {
        Client client = clientRepository.findByEmail(email);
        if (client != null) {
            model.addAttribute("client", client);
            return "client-details"; // Redirect to client-details.html with client details
        } else {
            return "new-client"; // Redirect to new-client.html if client not found
        }
    }
}
