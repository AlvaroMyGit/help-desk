package btech.service;

import btech.model.concrete.Repair;
import btech.repository.RepairRepository;
import btech.util.RepairStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RepairService {

    @Autowired
    private RepairRepository repairRepository;

    @Transactional
    public Repair addRepair(Repair repair) {
        return repairRepository.save(repair);
    }

    @Transactional
    public List<Repair> getOpenRepairs() {
        return repairRepository.findByStatusNot(RepairStatus.COMPLETED);
    }

    @Transactional
    public Optional<Repair> getRepairById(Long id) {
        return repairRepository.findById(id);
    }

    @Transactional
    public void deleteRepairById(Long id) {
        repairRepository.deleteById(id);
    }

    // Additional methods for RepairService can be added here as needed
}
