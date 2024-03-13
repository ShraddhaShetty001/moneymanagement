package com.example.frugal.moneymanagement.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Spending {

    @Id
    String id;
    @Column(name = "amount_spent")
    double amountSpent;
}
