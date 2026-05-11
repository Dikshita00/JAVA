package com.test;


import java.util.Scanner;

import com.entity.ElectricVehicle;
import com.entity.PetrolVehicle;
import com.service.VehicleService;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VehicleService service = new VehicleService();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 Add Vehicle");
            System.out.println("2 Remove Vehicle");
            System.out.println("3 Update Price");
            System.out.println("4 Sell Vehicle");
            System.out.println("5 Purchase Vehicle");
            System.out.println("6 Display All");
            System.out.println("7 Display By Type");
            System.out.println("8 Price Range");
            System.out.println("9 Sort By Price");
            System.out.println("10 Search by Name");
            System.out.println("11 Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("1 Electric  2 Petrol");
                    int type = sc.nextInt();

                    System.out.print("Id: "); int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Price: "); double price = sc.nextDouble();

                    if (type == 1) {
                        System.out.print("Battery: "); double b = sc.nextDouble();
                        System.out.print("ChargeTime: "); double c = sc.nextDouble();

                        service.addVehicle(
                                new ElectricVehicle(id, name, price, "Available", b, c));
                    } else {
                        sc.nextLine();
                        System.out.print("FuelType: "); String fuel = sc.nextLine();
                        System.out.print("Mileage: "); double m = sc.nextDouble();

                        service.addVehicle(
                                new PetrolVehicle(id, name, price, "Available", fuel, m));
                    }
                    break;

                case 2:
                    service.removeVehicle(sc.nextInt());
                    break;

                case 3:
                    service.updatePrice(sc.nextInt(), sc.nextDouble());
                    break;

                case 4:
                    service.sellVehicle(sc.nextInt());
                    break;

                case 5:
                    service.purchaseVehicle(sc.nextInt());
                    break;

                case 6:
                    service.displayAll();
                    break;

                case 7:
                    sc.nextLine();
                    service.displayByType(sc.nextLine());
                    break;

                case 8:
                    service.priceRange(sc.nextDouble(), sc.nextDouble());
                    break;

                case 9:
                    service.sortByPrice();
                    break;

                case 10:
                    sc.nextLine();
                    service.searchByName(sc.nextLine());
                    break;

                case 11:
                    System.exit(0);
            }
        }
    }
}