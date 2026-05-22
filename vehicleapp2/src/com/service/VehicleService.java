package com.service;

import java.util.TreeSet;

import com.entity.Vehicle;

public class VehicleService {
	
	private TreeSet<Vehicle> set = new TreeSet<>();

	public void addVehicle(Vehicle v) {
		if(set.add(v)) 
			System.out.println("Vehicle added");
		else
			System.out.println("Duplicate VID not allowed");
	}
	
	public void deleteVehicle(int vid) {
		 boolean removed=set.removeIf(v -> v.getVid()==vid);
		System.out.println(removed);
	}
	
	public void bookVehicle(int vid) {
		for(Vehicle v : set) {
			if(v.getVid()==vid) {
				v.setStatue("Booked");
				System.out.println("Vehicle booked");
				return;
			}
		}System.out.println("vehicle not found");
	}
	public void displayAll() {
		set.forEach(System.out::println);
	}
	
}








