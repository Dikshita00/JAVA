package com.service;

import java.util.*;
import java.util.stream.Collectors;

import com.dao.VehicleDao;
import com.entity.Vehicle;

public class VehicleService {

    private VehicleDao dao = new VehicleDao();

    public void addVehicle(Vehicle v) {
        if (dao.addVehicle(v))
            System.out.println("Vehicle added");
        else
            System.out.println("Duplicate vehicleId not allowed");
    }

    public void removeVehicle(int id) {
        if (dao.removeVehicle(id))
            System.out.println("Vehicle removed");
        else
            System.out.println("Vehicle not found");
    }

    public void updatePrice(int id, double price) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getVehicleId() == id) {
                v.setPrice(price);
                System.out.println("Price updated");
                return;
            }
        }
        System.out.println("Vehicle not found");
    }

    public void sellVehicle(int id) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getVehicleId() == id) {
                v.setStatus("Sold");
                System.out.println("Vehicle sold");
                return;
            }
        }
    }

    public void purchaseVehicle(int id) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getVehicleId() == id) {
                v.setStatus("Available");
                System.out.println("Vehicle purchased");
                return;
            }
        }
    }

    public void displayAll() {
        dao.getAllVehicles().forEach(System.out::println);
    }

    public void displayByType(String type) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getClass().getSimpleName().equalsIgnoreCase(type)) {
                System.out.println(v);
            }
        }
    }

    public void priceRange(double min, double max) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                System.out.println(v);
            }
        }
    }

    public void sortByPrice() {
        List<Vehicle> list = new ArrayList<>(dao.getAllVehicles());
        list.sort(Comparator.comparingDouble(Vehicle::getPrice));
        list.forEach(System.out::println);
    }

    public void searchByName(String name) {
        for (Vehicle v : dao.getAllVehicles()) {
            if (v.getVehicleName().equalsIgnoreCase(name)) {
                System.out.println(v);
            }
        }
    }
}