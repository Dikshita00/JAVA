package com.day8.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<com.day8.beans.Employee> displayAll();

	com.day8.beans.Employee searchById(int eid);

	boolean deleteById(int eid);

	List<com.day8.beans.Employee> findByName(String nm);

}
