package org.example.projet_pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Complaint {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complaintId;

    @Temporal(TemporalType.DATE)
    private java.util.Date date;

    private String message;
    private String response;
    private String status;

    @ManyToOne
    private Client client;

    @ManyToOne
    private AgentAssurance agentAssurance;

    @ManyToOne
    private AgentFinance agentFinance;
}

