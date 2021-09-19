package org.travel.lodge.hotel.system.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.travel.lodge.hotel.system.entity.User;
import org.travel.lodge.hotel.system.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	//Add new user
	public void saveUser(User user) {
		userRepository.save(user);
	}

	//Validation for login
	public boolean validate(String email, String password) {
		Optional<User> user = userRepository.findById(email);
		if((user)!=null)
		{
			if(user.get().getPassword().equals(password))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
			return false;		
	}
}
