package com.day8.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<com.day8.beans.Employee> findAll();

	com.day8.beans.Employee findById(int eid);

	boolean removeById(int eid);

	List<com.day8.beans.Employee> findByName(String nm);

	boolean save(com.day8.beans.Employee e);

}
