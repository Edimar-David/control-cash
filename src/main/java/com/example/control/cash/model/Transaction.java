package com.example.control.cash.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static jakarta.persistence.GenerationType.*;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String description;

    private BigDecimal amount;

    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

}
