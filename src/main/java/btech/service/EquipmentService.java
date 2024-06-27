package btech.service;

import btech.model.concrete.Equipment;
import btech.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Transactional
    public Equipment addEquipment(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    @Transactional
    public Optional<Equipment> getEquipmentById(Long id) {
        return equipmentRepository.findById(id);
    }

    @Transactional
    public void deleteEquipmentById(Long id) {
        equipmentRepository.deleteById(id);
    }

    // Additional methods for EquipmentService can be added here as needed
}
