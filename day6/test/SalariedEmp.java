package com.day6.test;

import java.util.Date;

public class SalariedEmp extends Employee {
    private double salary;

    public SalariedEmp(String name, Date doj, String dept, String desg, double salary) {
        super(name, doj, dept, desg);
        this.salary = salary;
    }

    @Override
    public double calculate() {
        return salary;
    }
}
