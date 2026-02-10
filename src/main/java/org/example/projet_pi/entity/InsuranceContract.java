package org.example.projet_pi.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class InsuranceContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractId;

    private Date startDate;

    private Date endDate;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    @ManyToOne
    private Client client;

    @ManyToOne
    private InsuranceProduct product;

    @ManyToOne
    private AgentAssurance agentAssurance;

    @OneToMany(mappedBy = "contract")
    private List<Claim> claims;
}

