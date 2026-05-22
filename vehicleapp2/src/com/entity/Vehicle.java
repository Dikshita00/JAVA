package com.entity;

import java.util.Date;

public class Vehicle implements Comparable<Vehicle>{

	private int vid;
	private String vehicleName;
	private String ownerName;
	private String model;
	private String make;
	private double price;
	private String statue;
	private Date manufacuringDate;
	public Vehicle(int vid, String vehicleName, String ownerName, String model, String make, double price,
			String statue, Date manufacuringDate) {
		super();
		this.vid = vid;
		this.vehicleName = vehicleName;
		this.ownerName = ownerName;
		this.model = model;
		this.make = make;
		this.price = price;
		this.statue = statue;
		this.manufacuringDate = manufacuringDate;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatue() {
		return statue;
	}
	public void setStatue(String statue) {
		this.statue = statue;
	}
	public Date getManufacuringDate() {
		return manufacuringDate;
	}
	public void setManufacuringDate(Date manufacuringDate) {
		this.manufacuringDate = manufacuringDate;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", vehicleName=" + vehicleName + ", ownerName=" + ownerName + ", model=" + model
				+ ", make=" + make + ", price=" + price + ", statue=" + statue + ", manufacuringDate="
				+ manufacuringDate + "]";
	}
	@Override
	public int compareTo(Vehicle v) {
		// TODO Auto-generated method stub
		return this.vid - v.vid;
	}
	
	
	
	

}
