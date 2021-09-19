package org.travel.lodge.hotel.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.travel.lodge.hotel.system.entity.User;

/**
 * @author Kanesh
 * User repository 
 */
@Repository
public interface UserRepository extends JpaRepository<User, String>{
	//Finding users by email
	User findByEmail(String email);

}
