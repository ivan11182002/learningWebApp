package com.tutorialspoint;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao empDao = (EmployeeDao)context.getBean("empDao");
		
		int empno = 8002;
		Employee emp = new Employee();
		emp.seteName("Ivan");
		emp.setJob("PG");
		
		//do insert
//		int iFlag = empDao.insert(emp);
//		if(iFlag > 0){
//			System.out.println("insert Success!" );
//		}else{
//			System.out.println("insert Failed!" );
//		}
		
		//do query
		List<Map<String,Object>> query = empDao.query();
		for (Map<String,Object> map : query) {
			System.out.format("empList info: empNo=%s, eName=%s, job=%s \n",(map.get("empno")).toString(), map.get("ename"), map.get("job"));	
		}
		
		//do query by PK
		Employee thisEmp = empDao.queryByPk(empno);
		if(thisEmp != null){
			System.out.format("emp info: empNo=%d, eName=%s, job=%s \n",thisEmp.getEmpNo(), thisEmp.geteName(), thisEmp.getJob());
		}else{
			System.out.println("Data Not Found!");
		}
		//do update
		int uFlag = empDao.update(empno, emp);
		if(uFlag > 0){ 
			System.out.println("update Success!"); 
		}else{
			System.out.println("update Failed!"); 
		}
		
		//do delete
		int dFlag = empDao.delete(empno);
		if(dFlag > 0){ 
			System.out.println("delete Success!"); 
		}else{
			System.out.println("delete Failed!"); 
		}
		
		
		context.close();
		
	}

}
