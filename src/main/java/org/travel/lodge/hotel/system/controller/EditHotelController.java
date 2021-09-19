package org.travel.lodge.hotel.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.travel.lodge.hotel.system.entity.Hotel;
import org.travel.lodge.hotel.system.service.HotelService;

/**
 * @author Kanesh
 *
 */
@RestController
public class EditHotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/editHotel")
	public ModelAndView editHotelPage(ModelAndView modelAndView, Hotel hotel) {
		modelAndView.addObject("hotel", hotel);
		modelAndView.setViewName("editHotel");
		return modelAndView;
	}

	//Edit Details of hotels
	@PostMapping("/editHotel")
	public ModelAndView updateHotelDetails(ModelAndView modelandview, @ModelAttribute Hotel hotel, @RequestParam String hotelname, ModelMap models) {
		boolean status = hotelService.updateHotel(hotel,hotelname);
		if(status == true) {

			modelandview.setViewName("redirect:/editHotel");
		}
		else
		{
			models.addAttribute("error","No hotel found");
			modelandview.setViewName("editHotel");
		}
		return modelandview;		
	}
}
