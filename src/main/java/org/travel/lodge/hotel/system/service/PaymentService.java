package org.travel.lodge.hotel.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.travel.lodge.hotel.system.entity.PaymentDetails;
import org.travel.lodge.hotel.system.repository.PaymentRepository;

/**
 * @author Kanesh
 *
 */
@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	
	//Saving payment
	public void savePayment(PaymentDetails pay) {
		paymentRepository.save(pay);
	}
	
	//Update reservation
	public boolean updateReservation(PaymentDetails pay,String email) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.delete(pay);
			paymentRepository.save(pay);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	//Cancel reservation
	public boolean cancelReservation(String email, String hotelname) {
		if(paymentRepository.findById(email)!=null)
		{
			paymentRepository.deleteById(email);
			return true;
		}
		else
		{
			return false;
		}
	}

}
