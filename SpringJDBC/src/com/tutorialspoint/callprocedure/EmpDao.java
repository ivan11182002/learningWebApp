package com.tutorialspoint.callprocedure;

import java.util.List;

import javax.sql.DataSource;

import com.tutorialspoint.Employee;

public interface EmpDao {
	public void setDataSource(DataSource ds);
	
	public Employee getEmp(int empNo);
	
	
}
