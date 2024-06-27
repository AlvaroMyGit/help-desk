package btech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/find-client")
    public String findClientByEmail() {
        return "find-client";
    }

    @GetMapping("/new-client")
    public String createNewClient() {
        return "new-client";
    }
}
