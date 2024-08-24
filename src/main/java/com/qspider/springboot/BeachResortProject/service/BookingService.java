package com.qspider.springboot.BeachResortProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.qspider.springboot.BeachResortProject.dao.BookingDao;
import com.qspider.springboot.BeachResortProject.entity.Booking;
import com.qspider.springboot.BeachResortProject.util.ResponseStructure;

@Service
public class BookingService<T> {
	@Autowired
	BookingDao dao;
	@Autowired
	ResponseStructure<Booking> resstructure;
	

	public ResponseEntity<ResponseStructure<Booking>> savebooking(Booking booking) {
		Booking save_booking=dao.saveBooking(booking);
		if(save_booking!=null) {
			resstructure.setStatus(HttpStatus.CREATED.value());
			resstructure.setMessage("Booking saved successfully");
			resstructure.setData(save_booking);
			return new ResponseEntity<ResponseStructure<Booking>>(resstructure,HttpStatus.CREATED);
			
		}
		return null;
	}
}
