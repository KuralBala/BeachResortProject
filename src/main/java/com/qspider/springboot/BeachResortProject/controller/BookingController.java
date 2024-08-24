package com.qspider.springboot.BeachResortProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qspider.springboot.BeachResortProject.entity.Booking;
import com.qspider.springboot.BeachResortProject.service.BookingService;
import com.qspider.springboot.BeachResortProject.util.ResponseStructure;

@RestController
@RequestMapping("booking")
public class BookingController {

	@Autowired
	BookingService <Booking> service;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Booking>> saveAadhar(@RequestBody Booking booking) {
		return service.savebooking(booking);
		
	}
}
