package org.example.projet_pi.controller;

import org.example.projet_pi.service.ICreditService;
import org.example.projet_pi.entity.Credit;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Credit")
public class CreditController {

    private final ICreditService creditService;

    public CreditController(ICreditService creditService) {
        this.creditService = creditService;
    }

    @PostMapping("/addCredit")
    public Credit addCredit(@RequestBody Credit credit) {
        return creditService.addCredit(credit);
    }

    @PutMapping("/updateCredit")
    public Credit updateCredit(@RequestBody Credit credit) {
        return creditService.updateCredit(credit);
    }

    @DeleteMapping("/deleteCredit/{id}")
    public void deleteCredit(@PathVariable Long id) {
        creditService.deleteCredit(id);
    }


    @GetMapping("/allCredit")
    public List<Credit> getAllCredits() {
        return creditService.getAllCredits();
    }
}
