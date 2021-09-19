package org.travel.lodge.hotel.system.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kanesh
 *
 */
@RestController
public class HomeController {

	@GetMapping("/home")
	public ModelAndView homePage() {

		return new ModelAndView("home");
	}
}
