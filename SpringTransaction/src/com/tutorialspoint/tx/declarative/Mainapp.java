package com.tutorialspoint.tx.declarative;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.Employee;

public class Mainapp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("empDaoImpl");
		
		Employee emp = newEmp();
		
		dao.insert(emp);
		
		context.close();
	}

	private static Employee newEmp() {
		Employee e = new Employee();
		e.setEmpNo(9999);	//not used in this case
		e.seteName("Kevin");
		e.setJob("PG");
		e.setDeptNo(50);
		e.setdName("RESEARCH1");
		e.setLoc("DALLAS1");
		
		return e;
	}

}
