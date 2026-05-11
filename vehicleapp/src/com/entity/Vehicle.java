package com.entity;

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