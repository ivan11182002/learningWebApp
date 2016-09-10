package com.tutorialspoint;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
	public List<Map<String,Object>> query();
	
	public Employee queryByPk(Integer empno);
	
	public int insert(Employee emp);
	
	public int update(Integer empno, Employee data);
	
	public int delete(Integer empno);
	
}
