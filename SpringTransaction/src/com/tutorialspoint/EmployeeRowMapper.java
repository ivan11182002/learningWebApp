package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int i) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpNo(rs.getInt("empno"));
		emp.seteName(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		return emp;
	}

}
