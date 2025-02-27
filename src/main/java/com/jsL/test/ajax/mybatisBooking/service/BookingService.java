package com.jsL.test.ajax.mybatisBooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsL.test.ajax.mybatisBooking.domain.Booking;
import com.jsL.test.ajax.mybatisBooking.repository.BookingRepository;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public List<Booking> getBooking(){
		List<Booking> booking = bookingRepository.selectBooking();
		return booking;
	}
	
	public boolean deleteBookingById(int id) {
		
		int count = bookingRepository.deleteBooking(id);
		if(count > 0) {
			return true;
		}
		return false;
		
	}
	
	public boolean insertBookingBy(Booking booking) {
		int count = bookingRepository.insertBooking(booking);
		if(count > 0) {
			return true;
		}
		return false;
	}
	
	

}
