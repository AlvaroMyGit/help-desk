package btech.model;

import java.time.LocalDate;

public interface RepairModel {
    Long getId();
    void setId(Long id);
    Long getEquipmentId();
    void setEquipmentId(Long equipmentId);
    String getDescription();
    void setDescription(String description);
    LocalDate getDateCompleted();
    void setDateCompleted(LocalDate dateCompleted);

}
