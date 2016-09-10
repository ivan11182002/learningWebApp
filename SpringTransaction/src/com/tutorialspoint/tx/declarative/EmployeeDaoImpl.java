package com.tutorialspoint.tx.declarative;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.tutorialspoint.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		jdbcTemplateObj = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Map<String,Object>> query() {
		String sql = "select * from EMP e, DEPT d where e.deptno = d.deptno";
		List<Map<String,Object>> empList = jdbcTemplateObj.queryForList(sql);
		return empList;
	}


	@Override
	public void insert(Employee emp) {
		try {
			String sql1 = "insert into EMP(empno, ename, job) values((select max(empno)+1 from emp), ?, ?)";
			jdbcTemplateObj.update(sql1, emp.geteName(), emp.getJob());
			
			String sql2 = "select max(empno) from emp";
			Map<String, Object> empMap = jdbcTemplateObj.queryForMap(sql2);
			
			String sql3 = "insert into DEPT(deptno, dname, loc) values(?, ?, ?)";
			jdbcTemplateObj.update(sql3, emp.getDeptNo(), emp.getdName(), emp.getLoc());
			
			System.out.println("*** Sql Syntax end ***");
			
			throw new RuntimeException("simulate Error condition") ;
			
	      } catch (DataAccessException e) {
	         System.out.println("DataAccessException in creating record, rolling back");
	         throw e;
	      } catch (Exception e) {
	         System.out.println("Exception in creating record, rolling back");
	         throw e;
	      }
		
		
		
		
		
		
	}



}
