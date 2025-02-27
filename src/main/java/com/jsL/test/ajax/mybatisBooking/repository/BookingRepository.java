package com.jsL.test.ajax.mybatisBooking.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jsL.test.ajax.mybatisBooking.domain.Booking;

@Mapper
public interface BookingRepository {
	public List<Booking> selectBooking();
	
	public int deleteBooking(@Param("id")int id);
	
	public int insertBooking(Booking booking);
	
}
