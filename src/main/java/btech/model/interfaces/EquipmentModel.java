package btech.model.interfaces;


import btech.model.concrete.Client;

import java.time.LocalDate;

public interface EquipmentModel {

    Long getId();
    void setId(Long id);
    Client getClient();
    void setClient(Client client);
    String getDescription();
    void setDescription(String description);
    LocalDate getDateReceived();
    void setDateReceived(LocalDate localDate);
}
