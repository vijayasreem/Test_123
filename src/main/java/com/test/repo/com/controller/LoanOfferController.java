package com.test.repo.com.controller;

import com.test.repo.com.model.LoanOffer;
import com.test.repo.com.service.LoanOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loan-offers")
public class LoanOfferController {

    private final LoanOfferService loanOfferService;

    @Autowired
    public LoanOfferController(LoanOfferService loanOfferService) {
        this.loanOfferService = loanOfferService;
    }

    @GetMapping("/{customerId}")
    public LoanOffer findByCustomerId(@PathVariable Long customerId) {
        return loanOfferService.findByCustomerId(customerId);
    }

    @GetMapping("/{customerId}/pending")
    public LoanOffer findPendingOfferByCustomerId(@PathVariable Long customerId) {
        return loanOfferService.findPendingOfferByCustomerId(customerId);
    }

    @GetMapping("/{customerId}/accepted-count")
    public int countAcceptedOffersByCustomerId(@PathVariable Long customerId) {
        return loanOfferService.countAcceptedOffersByCustomerId(customerId);
    }

    @GetMapping("/{customerId}/rejected-count")
    public int countRejectedOffersByCustomerId(@PathVariable Long customerId) {
        return loanOfferService.countRejectedOffersByCustomerId(customerId);
    }

    @GetMapping("/{customerId}/pending-count")
    public int countPendingOffersByCustomerId(@PathVariable Long customerId) {
        return loanOfferService.countPendingOffersByCustomerId(customerId);
    }

    // Add more business methods as needed

}