package com.qspider.springboot.BeachResortProject.entity;

public class AdditionalServices {
	private String service_id;
	private String service_name;
	private double cost;
	//private String description;
	public String getService_id() {
		return service_id;
	}
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
