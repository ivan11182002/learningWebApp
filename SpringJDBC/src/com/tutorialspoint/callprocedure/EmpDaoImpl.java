package com.tutorialspoint.callprocedure;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.tutorialspoint.Employee;

public class EmpDaoImpl implements EmpDao {
	private DataSource ds;
	private SimpleJdbcCall jdbcCall;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.ds = ds;
		jdbcCall = new SimpleJdbcCall(ds).withProcedureName("IVEN_GET_EMP_DATA");
	}

	@Override
	public Employee getEmp(int empNo) {
		try {
			SqlParameterSource in = new MapSqlParameterSource().addValue("P_EMPNO", empNo);
			Map<String, Object> out = jdbcCall.execute(in);
			
			Employee emp = new Employee();
			emp.setEmpNo(empNo);
			emp.seteName((String)out.get("O_DEMT_NAME"));
			emp.setJob(out.get("O_YEAR_SAL").toString());
			
			return emp;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
			
			return null;
		} 
		
		
	}

}
