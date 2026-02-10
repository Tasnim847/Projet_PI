package org.example.projet_pi.entity;

import jakarta.persistence.*;

@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long creditId;

    private double amount;
    private double interestRate;

    @Temporal(TemporalType.DATE)
    private java.util.Date startDate;

    @Temporal(TemporalType.DATE)
    private java.util.Date endDate;

    @Enumerated(EnumType.STRING)
    private CreditStatus status;

    @ManyToOne
    private Client client;

    @ManyToOne
    private AgentFinance agentFinance;

}

