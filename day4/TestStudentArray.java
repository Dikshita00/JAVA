package com.day4;

import java.util.Scanner;

public class TestStudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n1. Add new student");
            System.out.println("2. Display all");
            System.out.println("3. Search by ID");
            System.out.println("4. Search by name");
            System.out.println("5. Update marks");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean status = StudentService.addNewStudent();
                    if (status) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Error: Student not added.");
                    }
                    break;

                case 2:
                    StudentService.displayAll();
                    break;

                case 3:
                    // Feature not implemented yet
                    System.out.println("Search by ID is not implemented yet.");
                    break;

                case 4:
                    // Feature not implemented yet
                    System.out.println("Search by name is not implemented yet.");
                    break;

                case 5:
                    // Feature not implemented yet
                    System.out.println("Update marks is not implemented yet.");
                    break;

                case 6:
                    sc.close();
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Wrong choice. Try again.");
            }

        } while (choice != 6);
    }
}
