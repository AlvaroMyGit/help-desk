package btech.model.concrete;

import btech.model.interfaces.EquipmentModel;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "equipment")
public class Equipment implements EquipmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    private String description;
    private LocalDate dateReceived;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDate getDateReceived() {
        return dateReceived;
    }

    @Override
    public void setDateReceived(LocalDate dateReceived) {
        this.dateReceived = dateReceived;
    }
}
