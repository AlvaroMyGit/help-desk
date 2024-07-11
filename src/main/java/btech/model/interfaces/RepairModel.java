package btech.model.interfaces;

import btech.model.concrete.Equipment;
import btech.util.RepairStatus;

import java.math.BigDecimal;
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
    RepairStatus getStatus();
    void setStatus(RepairStatus repairStatus);

    BigDecimal getPrice();
    void setPrice(BigDecimal price);
}
