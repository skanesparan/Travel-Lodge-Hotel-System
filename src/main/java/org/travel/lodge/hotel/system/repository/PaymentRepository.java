package org.travel.lodge.hotel.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.travel.lodge.hotel.system.entity.PaymentDetails;

/**
 * @author Kanesh
 * Payment repository
 */
@Repository
public interface PaymentRepository extends JpaRepository<PaymentDetails, String>{
	
}
