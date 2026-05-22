package com.entity;

import java.util.Date;

public class TwoWheeler extends Vehicle {
	
	private double dickyCapacity;
	private String gearType;
	

	public TwoWheeler(int vid, String vehicleName, String ownerName, String model, String make, double price,
			String statue, Date manufacuringDate, double dickyCapacity, String gearType) {
		super(vid, vehicleName, ownerName, model, make, price, statue, manufacuringDate);
		this.dickyCapacity = dickyCapacity;
		this.gearType = gearType;
	}

	@Override
	public String toString() {
		return "TwoWheeler [dickyCapacity=" + dickyCapacity + ", gearType=" + gearType + "]";
	}
	
	
	
	

}
