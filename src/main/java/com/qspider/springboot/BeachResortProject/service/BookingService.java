package com.qspider.springboot.BeachResortProject.service;

import java.util.List;

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
	
	public ResponseEntity<ResponseStructure<Booking>> findById(String id){
		Booking find_booking=dao.findbookingById(id);
		if(find_booking !=null) {
			resstructure.setStatus(HttpStatus.FOUND.value());
			resstructure.setMessage("Found sucessfully");
			resstructure.setData(find_booking);
			return new ResponseEntity<ResponseStructure<Booking>>(resstructure,HttpStatus.FOUND);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<Booking>> deleteById(String id){
		Booking delete_booking=dao.findbookingById(id);
		if(delete_booking !=null) {
			resstructure.setStatus(HttpStatus.FOUND.value());
			resstructure.setMessage("Deleted sucessfully");
			resstructure.setData(delete_booking);
			return new ResponseEntity<ResponseStructure<Booking>>(resstructure,HttpStatus.FOUND);
		}
		return null;
		
	}
	
	public ResponseEntity<ResponseStructure<List<Booking>>> findAll(){
		List<Booking> allbooking=dao.findAllBooking();
		if(allbooking!=null) {
		ResponseStructure<List<Booking>> structure =new ResponseStructure<List<Booking>>();
		  structure.setStatus(HttpStatus.FOUND.value());
		  structure.setMessage("users found");
		  structure.setData(dao.findAllBooking());
		  return new ResponseEntity<ResponseStructure<List<Booking>>>(structure,HttpStatus.FOUND);		
	}
		return null;
	}
}
