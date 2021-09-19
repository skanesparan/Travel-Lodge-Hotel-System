package org.travel.lodge.hotel.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.travel.lodge.hotel.system.entity.Hotel;
import org.travel.lodge.hotel.system.repository.HotelRepository;

/**
 * @author Kanesh
 *
 */
@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	//Adding new Hotel
	public boolean saveHotel(Hotel hotel, String hotelname) {
		if(hotelRepository.findById(hotelname).isPresent())
		{
			return true;
		}
		else
		{
			hotelRepository.save(hotel);
			return false;
		}

	}

	//Update Hotel details
	public boolean updateHotel(Hotel hotel, String hotelname) {
		if(hotelRepository.findById(hotelname)!=null)
		{
			hotelRepository.delete(hotel);
			hotelRepository.save(hotel);
			return true;
		}
		else
		{
			return false;
		}
	}
}
