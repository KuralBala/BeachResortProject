package com.qspider.springboot.BeachResortProject.entity;

public class Booking {
	private String id;
	private String room_status;
	private String payment_status;
	
//	private List<Rooms> rooms;
//	
//	private List<Services> services;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public String getRoom_status() {
		return room_status;
	}

	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}

	public String getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
//
//	public List<Rooms> getRooms() {
//		return rooms;
//	}
//
//	public void setRooms(List<Rooms> rooms) {
//		this.rooms = rooms;
//	}
//
//	public List<Services> getServices() {
//		return services;
//	}
//
//	public void setServices(List<Services> services) {
//		this.services = services;
//	}

	
	

}
