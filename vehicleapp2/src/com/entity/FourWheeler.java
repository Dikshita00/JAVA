package com.entity;

import java.util.Date;

public class FourWheeler extends Vehicle{
	
	private String engineType;
	private String gearType;
	public FourWheeler(int vid, String vehicleName, String ownerName, String model, String make, double price,
			String statue, Date manufacuringDate, String engineType, String gearType) {
		super(vid, vehicleName, ownerName, model, make, price, statue, manufacuringDate);
		this.engineType = engineType;
		this.gearType = gearType;
	}
	@Override
	public String toString() {
		return "FourWheeler [engineType=" + engineType + ", gearType=" + gearType + "]";
	}
	
	
	

}
