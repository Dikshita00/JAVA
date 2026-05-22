package com.entity;
/*
  Q1. Design Java application for the following:  
Create a class Vehicle to store following details 
vehicleId, vehicleName, price, status 
Vehicles are of 2 types 
Electric Vehicle, Petrol Vehicle 
For Electric Vehicle store batteryCapacity, chargingTime 
For Petrol Vehicle add fuelType and mileage 
Store details of vehicles in a HashSet, 2 vehicles cannot have same vehicleId. 
Display following menu 
a. Add new Vehicle 
b. Remove vehicle using vehicleId 
c. Update vehicle price 
d. Sell vehicle 
e. Purchase vehicle 
f. Display all vehicles 
g. Display vehicles by type 
h. Display vehicles within price range 
i. Sort vehicles by price 
j. Search vehicle by name 
k. Exit
 */
public class Vehicle {
    private int vehicleId;
    private String vehicleName;
    private double price;
    private String status; // Available / Sold

    public Vehicle(int vehicleId, String vehicleName, double price, String status) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.price = price;
        this.status = status;
    }

    // Getters and Setters
    public int getVehicleId() { return vehicleId; }
    public void setVehicleId(int vehicleId) { this.vehicleId = vehicleId; }

    public String getVehicleName() { return vehicleName; }
    public void setVehicleName(String vehicleName) { this.vehicleName = vehicleName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    // IMPORTANT: ensures uniqueness in HashSet
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) obj;
        return this.vehicleId == v.vehicleId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(vehicleId);
    }

    @Override
    public String toString() {
        return vehicleId + " | " + vehicleName + " | " + price + " | " + status;
    }
}