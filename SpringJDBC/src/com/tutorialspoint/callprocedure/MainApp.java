package com.tutorialspoint.callprocedure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorialspoint.Employee;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		EmpDao dao = (EmpDao)context.getBean("empCallDao");
		
		final int empno = 8001;
		Employee emp = dao.getEmp(empno);
		if(emp != null){
			System.out.println("empDept=" + emp.geteName() + ", empYearSal=" + emp.getJob());
		}else{
			System.out.println("Error!");
		}
		
		context.close();
	}

}
