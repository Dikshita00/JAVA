package com.day11.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseService {
	boolean addNewCource();
	Map<String, Integer> displayAll();
	int searchByName(String cname);
	boolean modifyName(String Cname, Integer newcap);
	Set<String> displayByCapacity(int capacity);
	boolean modifyCourceName(String oname,String nname);
	boolean deleteByName(String cname);
	boolean deleteByCapacity(int capacity);
	Map<String, Integer>sortByName();
	Set<Entry<String, Integer>> sortByCapacity();
	boolean modifyByName(String cname, int newcap);
	boolean addNewCourse();
	boolean modifyCourseName(String oname, String nname);
	boolean modifyByName(String cname, Integer newcap);
	Set<Entry<String, Integer>> sortByCapacity1();

}
