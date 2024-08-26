package com.qspider.springboot.BeachResortProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<ResponseStructure<Booking>> savebooking(@RequestBody Booking booking) {
		return service.savebooking(booking);
		
	}
	@GetMapping
	public ResponseEntity<ResponseStructure<Booking>> findbooking(@RequestParam String id){
		return service.findById(id);
	}
	
	@DeleteMapping
	public ResponseEntity<ResponseStructure<Booking>> deletebooking(@RequestParam String id){
		return service.deleteById(id);
	}
	@GetMapping("all")
	public ResponseEntity<ResponseStructure<List<Booking>>> findAll(){
		return service.findAll();
	}
}
