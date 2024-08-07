package btech.model.concrete;

import btech.model.interfaces.RepairModel;
import btech.util.RepairStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table (name = "repair")
public class Repair implements RepairModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    private Equipment equipment;
    private String description;

    private BigDecimal price;

    private LocalDate dateCompleted;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Enumerated(EnumType.STRING)
    private RepairStatus status;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    @Override
    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
    @Override
    public RepairStatus getStatus() {
        return status;
    }
    @Override
    public void setStatus(RepairStatus status) {
        this.status = status;
    }
}
