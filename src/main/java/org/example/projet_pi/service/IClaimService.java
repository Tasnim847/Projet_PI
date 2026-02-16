package org.example.projet_pi.service;

import org.example.projet_pi.entity.Claim;

import java.util.List;

public interface IClaimService {

    public Claim addClaim(Claim claim);

    public Claim updateClaim(Claim claim);

    public void deleteClaim(Long id);

    public Claim getClaimById(Long id);

    public List<Claim> getAllClaims();

}
