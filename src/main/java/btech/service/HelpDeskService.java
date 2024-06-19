package btech.service;


import btech.model.concrete.Client;
import btech.model.concrete.Equipment;
import btech.model.concrete.Repair;
import btech.repository.ClientRepository;
import btech.repository.EquipmentRepository;
import btech.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HelpDeskService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Autowired
    private RepairRepository repairRepository;

    @Transactional
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Transactional
    public Equipment addEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Transactional
    public Repair addRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    // Other methods to get and update entities
}
