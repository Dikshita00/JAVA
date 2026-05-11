package com.dao;

import java.util.*;

import com.entity.Vehicle;

public class VehicleDao {

    private HashSet<Vehicle> vehicleSet = new HashSet<>();

    // Add vehicle
    public boolean addVehicle(Vehicle v) {
        return vehicleSet.add(v); // duplicate blocked automatically
    }

    // Remove vehicle
    public boolean removeVehicle(int id) {
        return vehicleSet.removeIf(v -> v.getVehicleId() == id);
    }

    // Get all vehicles
    public HashSet<Vehicle> getAllVehicles() {
        return vehicleSet;
    }
}
	
