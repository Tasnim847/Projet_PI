package org.example.projet_pi.repository;

import org.example.projet_pi.entity.InsuranceContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceContractRepository extends JpaRepository<InsuranceContract,Long> {
}
