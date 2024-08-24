package com.qspider.springboot.BeachResortProject.dao;

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

}
