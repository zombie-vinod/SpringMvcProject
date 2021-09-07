package com.te.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.te.dto.Student;

public class DaoStudentImpl implements DaoStudent {
	
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public boolean insert(Student student) {
		String query = "INSERT INTO students VALUES (?, ?, ?,?)";
		int n =template.update(query,student.getName(), student.getId(), student.getPassword(), student.getMarks());
		if(n==1){return true;}
		return false;
	}
	
	public int delete(String name) {
		String query = "delete from students where name = ?";
		int n = template.update(query,name);
		return n;
	}
	
	public String getUserName(String name) {
		String query = "select * from students where name = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = template.queryForObject(query, rowMapper, name);
		return student.getPassword();
	}
	
	public Student getDetails(String name) {
		String query = "select * from students where name = ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		return template.queryForObject(query, rowMapper,name);
	}
	
	
	
	
	

}
