package com.tutorialspoint;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		jdbcTemplateObj = new JdbcTemplate(dataSource);
	}
	

	@Override
	public List<Map<String,Object>> query() {
		String sql = "select * from EMP";
		List<Map<String,Object>> empList = jdbcTemplateObj.queryForList(sql);
		return empList;
	}

	@Override
	public Employee queryByPk(Integer empNo) {
		String sql = "select * from EMP where empno = ?";
		Employee employee = null;
		try{
			employee = jdbcTemplateObj.queryForObject(sql, new Object[]{empNo}, new EmployeeRowMapper());
			return employee;
		}catch(EmptyResultDataAccessException e){
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Override
	public int insert(Employee emp) {
		String sql = "insert into EMP(empno, ename, job) values((select max(empno)+1 from emp), ?, ?)";
		int i = jdbcTemplateObj.update(sql, emp.geteName(), emp.getJob());
		return i;
	}

	@Override
	public int update(Integer empno, Employee emp) {
		String sql = "update EMP set ename=?, job=? where empno = ?";
		PreparedStatementSetter pss = new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, emp.geteName());
				ps.setString(2, emp.getJob());
				ps.setInt(3, empno);
			}
		};
		
		int i = jdbcTemplateObj.update(sql, pss);
		return i;
		
	}

	@Override
	public int delete(Integer empno) {
		String sql = "delete from emp where empno = ?";
		int i = jdbcTemplateObj.update(sql, empno);
		return i;
	}

}
