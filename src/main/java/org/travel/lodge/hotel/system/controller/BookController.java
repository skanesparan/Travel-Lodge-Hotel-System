package org.travel.lodge.hotel.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kanesh
 *
 */
@RestController
public class BookController {

	@GetMapping("/bookHotel")
	public ModelAndView searchHotelPage(ModelAndView modelAndView) {

		modelAndView.setViewName("bookHotel");
		return modelAndView;
	}

}
