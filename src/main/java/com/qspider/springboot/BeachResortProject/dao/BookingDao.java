package com.qspider.springboot.BeachResortProject.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qspider.springboot.BeachResortProject.entity.Booking;
import com.qspider.springboot.BeachResortProject.repo.BookingRepo;

@Repository
public class BookingDao {
	@Autowired
	BookingRepo repo;
	
	public Booking saveBooking(Booking booking) {
	return repo.save(booking);
	}

	public Booking findbookingById(String id) {
		Optional<Booking> optionalbooking=repo.findById(id);
		if(optionalbooking.isPresent()) {
			return optionalbooking.get();
		}
		return null;
	}
	
	public Booking deletebookingById(String id) {
		      Booking booking=findbookingById(id);
		      if(booking!=null) {
		    	  repo.delete(booking);
		    	  return booking;
		      }
			return booking;
	}
	
	public List<Booking> findAllBooking() {
		repo.findAll();
		return null;
	}
	
	//public Booking update
}
