package btech.repository;

import btech.model.concrete.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository extends JpaRepository<Repair, Long> {
}
