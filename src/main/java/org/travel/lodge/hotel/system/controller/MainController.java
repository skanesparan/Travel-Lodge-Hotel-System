package org.travel.lodge.hotel.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.travel.lodge.hotel.system.service.UserService;

/**
 * @author Kanesh
 *
 */
@RestController
public class MainController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public ModelAndView loginPage() {

		return new ModelAndView("login");
	}

	//logging in customer
	@PostMapping("/login")
	public ModelAndView processingLoginForm(ModelAndView model, @RequestParam String email, @RequestParam String password, ModelMap models){
		boolean status = userService.validate(email,password);
		if(status==true)
		{
			model.setViewName("redirect:/home");
			return model;
		}
		else
		{
			models.addAttribute("error", "Please enter correct login details.");
			model.setViewName("login");
			return model;
		}		
	}

	@GetMapping("/logout")
	public ModelAndView logoutPage( ) {		
		return new ModelAndView("redirect:/login");
	}
}	
