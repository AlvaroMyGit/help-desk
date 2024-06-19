package btech.model.interfaces;

import btech.model.concrete.Equipment;

import java.time.LocalDate;

public interface RepairModel {
    Long getId();
    void setId(Long id);
    Equipment getEquipment();
    void setEquipment(Equipment equipment);
    String getDescription();
    void setDescription(String description);
    LocalDate getDateCompleted();
    void setDateCompleted(LocalDate dateCompleted);

}
