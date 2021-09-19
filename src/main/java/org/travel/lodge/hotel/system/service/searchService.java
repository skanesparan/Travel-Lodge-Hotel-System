package org.travel.lodge.hotel.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.travel.lodge.hotel.system.entity.Hotel;
import org.travel.lodge.hotel.system.repository.HotelRepository;

@Service
public class searchService {
	
	@Autowired
	private HotelRepository hotelRepository;	
	
	//Search hotels
	public List<Hotel> searchHotel(String rating) {		
			return  hotelRepository.findByRating(rating);		
	}
}
