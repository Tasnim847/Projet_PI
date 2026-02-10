package org.example.projet_pi.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;

    private String name;

    private String type;

    private String filePath;

    private LocalDateTime uploadDate;

    @Enumerated(EnumType.STRING)
    private DocumentStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "verified_by_agent_finance_id")
    private AgentFinance verifiedByFinance;

    @ManyToOne
    @JoinColumn(name = "verified_by_agent_assurance_id")
    private AgentAssurance verifiedByAssurance;
}
