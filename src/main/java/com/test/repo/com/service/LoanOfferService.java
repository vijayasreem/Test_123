
package com.test.repo.com.service;

import com.test.repo.com.model.LoanOffer;
import com.test.repo.com.repository.LoanOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanOfferService {

    private final LoanOfferRepository loanOfferRepository;

    @Autowired
    public LoanOfferService(LoanOfferRepository loanOfferRepository) {
        this.loanOfferRepository = loanOfferRepository;
    }

    public LoanOffer findByCustomerId(Long customerId) {
        return loanOfferRepository.findByCustomerId(customerId);
    }

    public LoanOffer findPendingOfferByCustomerId(Long customerId) {
        return loanOfferRepository.findPendingOfferByCustomerId(customerId);
    }

    public int countAcceptedOffersByCustomerId(Long customerId) {
        return loanOfferRepository.countAcceptedOffersByCustomerId(customerId);
    }

    public int countRejectedOffersByCustomerId(Long customerId) {
        return loanOfferRepository.countRejectedOffersByCustomerId(customerId);
    }

    public int countPendingOffersByCustomerId(Long customerId) {
        return loanOfferRepository.countPendingOffersByCustomerId(customerId);
    }

    // Add more business methods as needed

}
