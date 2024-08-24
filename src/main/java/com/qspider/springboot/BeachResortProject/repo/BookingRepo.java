package com.qspider.springboot.BeachResortProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qspider.springboot.BeachResortProject.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, String>{

}
