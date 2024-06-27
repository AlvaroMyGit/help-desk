package btech.service;

import btech.model.concrete.Client;
import btech.model.concrete.Equipment;
import btech.model.concrete.Repair;
import btech.repository.ClientRepository;
import btech.repository.EquipmentRepository;
import btech.repository.RepairRepository;
import btech.util.RepairStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    public Optional<Client> getClientById(Long id) {
        return clientRepository.findById(id);
    }

    public List<Repair> getOpenRepairs() {
        return repairRepository.findByStatusNot(RepairStatus.COMPLETED);
    }

    public Optional<Client> findClientByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    // Other methods as needed
}
