package org.travel.lodge.hotel.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.travel.lodge.hotel.system.entity.User;
import org.travel.lodge.hotel.system.service.UserService;

/**
 * @author Kanesh
 *
 */
@RestController
public class RegisterController {

	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public ModelAndView registerPage(ModelAndView modelAndView, User user) {
		modelAndView.addObject("user", user);
		modelAndView.setViewName("register");
		return modelAndView;
	}

	//registration of user
	@PostMapping("/register")
	public ModelAndView processingRegistrationForm(ModelAndView modelAndView,@ModelAttribute User user) {
		userService.saveUser(user);
		modelAndView.setViewName("redirect:/login");
		return modelAndView;

	}

}
