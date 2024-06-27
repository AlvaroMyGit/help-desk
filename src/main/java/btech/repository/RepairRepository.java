package btech.repository;

import btech.model.concrete.Repair;
import btech.util.RepairStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepairRepository extends JpaRepository<Repair, Long> {
    List<Repair> findByStatusNot(RepairStatus status);
}
