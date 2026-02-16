package org.example.projet_pi.controller;

import lombok.AllArgsConstructor;
import org.example.projet_pi.service.ICompensationService;
import org.example.projet_pi.entity.Compensation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/compensations")
public class CompensationController {

    ICompensationService compensationService;

    @PostMapping("/addCompensation")
    public Compensation addCompensation(Compensation compensation) {
        Compensation newCompensation = compensationService.addCompensation(compensation);
        return newCompensation;
    }

    @PutMapping("/updateCompensation")
    public Compensation updateCompensation(Compensation compensation) {
        Compensation newCompensation = compensationService.updateCompensation(compensation);
        return newCompensation;
    }

    @DeleteMapping("/deleteCompensation/{id}")
    public void deleteCompensation(Long id) {
        compensationService.deleteCompensation(id);
    }

    @GetMapping("/getCompensation/{id}")
    public Compensation getCompensationById(Long id) {
        Compensation compensation = compensationService.getCompensationById(id);
        return compensation;
    }

    @GetMapping("/allCompensation")
    public List<Compensation> getAllCompensations() {
        List<Compensation> compensations = compensationService.getAllCompensations();
        return compensations;
    }

}
