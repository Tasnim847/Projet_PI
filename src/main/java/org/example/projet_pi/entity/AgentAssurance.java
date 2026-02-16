package org.example.projet_pi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class AgentAssurance extends User {
    public List<InsuranceContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<InsuranceContract> contracts) {
        this.contracts = contracts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Complaint> getComplaints() {
        return complaints;
    }

    public void setComplaints(List<Complaint> complaints) {
        this.complaints = complaints;
    }

    @OneToMany(mappedBy = "agentAssurance")
    private List<InsuranceContract> contracts;

    @OneToMany(mappedBy = "agentAssurance")
    private List<Client> clients;

    @OneToMany(mappedBy = "agentAssurance")
    private List<Complaint> complaints;
}
