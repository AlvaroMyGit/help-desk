package btech.controller;

import btech.model.concrete.Client;
import btech.model.concrete.Equipment;
import btech.model.concrete.Repair;
import btech.service.HelpDeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Optional;

@Controller
public class RepairController {

    @Autowired
    private HelpDeskService helpDeskService;

    @GetMapping("/add-repair")
    public String showAddRepairForm(@RequestParam Long clientId, Model model) {
        Optional<Client> client = helpDeskService.getClientById(clientId);
        if (client.isPresent()) {
            Equipment equipment = new Equipment();
            equipment.setClient(client.get());
            equipment.setDateReceived(LocalDate.now());
            Repair repair = new Repair();
            repair.setEquipment(equipment);
        model.addAttribute("repair", repair);
        }
        return "add-repair";
    }

    @PostMapping("/add-repair")
    public String processAddRepair(@ModelAttribute Repair repair) {
        Equipment equipment = repair.getEquipment();
        equipment.setDateReceived(LocalDate.now());
        helpDeskService.addEquipment(equipment);

        repair.setEquipment(equipment);
        helpDeskService.addRepair(repair);
        return "redirect:/";
    }
}
