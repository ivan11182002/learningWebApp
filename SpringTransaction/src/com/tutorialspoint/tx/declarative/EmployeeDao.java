package com.tutorialspoint.tx.declarative;

import java.util.List;
import java.util.Map;

import com.tutorialspoint.Employee;

public interface EmployeeDao {
	public List<Map<String,Object>> query();
	
	public void insert(Employee emp);
	
}
