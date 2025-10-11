package com.day6.beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeMain {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dob1 = sdf.parse("15/08/1990");
        Date dob2 = sdf.parse("22/11/1985");

        SalariedEmp se = new SalariedEmp("Amit", dob1, "IT", "Developer", 50000);
        ContractEmp ce = new ContractEmp("Priya", dob2, "HR", "Consultant", 120.5f, 850.0);

        System.out.println(se);
        System.out.println("Salaried Employee Salary: ₹" + se.calculateSal());

        System.out.println(ce);
        System.out.println("Contract Employee Salary: ₹" + ce.calculateSal());
    }
}
