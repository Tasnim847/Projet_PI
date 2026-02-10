package org.example.projet_pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class AgentFinance extends User {

    @OneToMany(mappedBy = "agentFinance")
    private List<Credit> credits;

    @OneToMany(mappedBy = "agentFinance")
    private List<Complaint> complaints;
}
