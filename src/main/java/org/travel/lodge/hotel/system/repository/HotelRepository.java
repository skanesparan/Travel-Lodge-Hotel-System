package org.travel.lodge.hotel.system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.travel.lodge.hotel.system.entity.Hotel;

/**
 * @author Kanesh
 * Hotel repository
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

	/*FindAll hotels*/
	List<Hotel> findByRating(String rating);
}
