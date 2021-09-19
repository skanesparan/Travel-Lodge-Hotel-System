package org.travel.lodge.hotel.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.travel.lodge.hotel.system.entity.Hotel;
import org.travel.lodge.hotel.system.service.searchService;

/**
 * @author Kanesh
 *
 */
@RestController
public class SearchHotelController {
	
	@Autowired
	private searchService searchService;
	
	@GetMapping("/searchHotel")
	public ModelAndView searchHotelPage(ModelAndView modelAndView) {		
		modelAndView.setViewName("searchHotel");
		return modelAndView;
	}
	
	
	//search details of hotel
	@PostMapping("/searchHotel")
	public ModelAndView searchHotelDetails(ModelAndView modelandview, ModelMap models, @RequestParam String rating) {
		List<Hotel> availablehotel = searchService.searchHotel(rating);
		if(availablehotel!=null)
		{
			models.addAttribute("names",true);
			models.addAttribute("hotelnames",availablehotel);
			modelandview.addObject("hotelnames", availablehotel);
			modelandview.setViewName("searchHotel");
			return modelandview;
		}
		else
		{
			models.addAttribute("error", "no hotels");
			modelandview.setViewName("searchHotel");
			return modelandview;
		}
		
	}
	
}
