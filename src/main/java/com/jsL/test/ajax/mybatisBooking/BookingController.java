package com.jsL.test.ajax.mybatisBooking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsL.test.ajax.mybatisBooking.domain.Booking;
import com.jsL.test.ajax.mybatisBooking.service.BookingService;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/main")
	public String mainPage() {
		return "ajax/bookingMain";
	}
	
	
	@GetMapping("/info")
	public String inputBooking(Model model) {
		
		List<Booking> bookingList = bookingService.getBooking();
		
		model.addAttribute("bookingList", bookingList);
		
		
		return "ajax/bookingInfo";
	}
	
	@ResponseBody
	@DeleteMapping("/delete")
	public Map<String, Boolean> deleteBooking(
			@RequestParam("id")int id
			){
		
		boolean isDelete = bookingService.deleteBookingById(id);
		
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(isDelete) {
			resultMap.put("isDelete", true);
		}
		else {
			resultMap.put("isDelete", false);
		}
		
		return resultMap;
		
	}
	
	@ResponseBody
	@GetMapping("/input")
	public Map<String, Boolean> insertBooking(
			@RequestParam("name")String name
			,@RequestParam("date")String date
			,@RequestParam("day")int day
			,@RequestParam("headcount")int headcount
			,@RequestParam("phoneNumber")String phoneNumber
			) {
		
		Booking booking = new Booking();
		booking.setName(name);
		booking.setHeadcount(headcount);
		booking.setDay(day);
		booking.setDate(date);
		booking.setPhoneNumber(phoneNumber);
		
		
		boolean isInsert = bookingService.insertBookingBy(booking);
		
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(isInsert) {
			resultMap.put("isInsert", true);
		}
		else {
			resultMap.put("isInsert", false);
		}
		
		return resultMap;
		
		
	}
	
	
	
	
	
	
	
	

}
