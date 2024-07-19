
package com.test.repo.com.repository;

import com.test.repo.com.model.LoanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanOfferRepository extends JpaRepository<LoanOffer, Long> {

    @Query("SELECT lo FROM LoanOffer lo WHERE lo.customerId = ?1")
    LoanOffer findByCustomerId(Long customerId);

    @Query("SELECT lo FROM LoanOffer lo WHERE lo.customerId = ?1 AND lo.status = 'PENDING'")
    LoanOffer findPendingOfferByCustomerId(Long customerId);

    @Query("SELECT COUNT(lo) FROM LoanOffer lo WHERE lo.customerId = ?1 AND lo.status = 'ACCEPTED'")
    int countAcceptedOffersByCustomerId(Long customerId);

    @Query("SELECT COUNT(lo) FROM LoanOffer lo WHERE lo.customerId = ?1 AND lo.status = 'REJECTED'")
    int countRejectedOffersByCustomerId(Long customerId);

    @Query("SELECT COUNT(lo) FROM LoanOffer lo WHERE lo.customerId = ?1 AND lo.status = 'PENDING'")
    int countPendingOffersByCustomerId(Long customerId);

    // Add more custom queries as needed

}
