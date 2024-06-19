package btech.model;


import java.time.LocalDate;

public interface EquipmentModel {

    Long getId();
    void setId(Long id);
    Long getClientId();
    void setClientId(Long clientId);
    String getDescription();
    void setDescription(String description);
    LocalDate getDateReceived();
    void setDateReceived(LocalDate localDate);
}
