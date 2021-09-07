package com.te.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.te.dto.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		
		student.setName(rs.getString(1));
		student.setId(rs.getString(2));
		student.setPassword(rs.getString(3));
		student.setMarks(rs.getString(4));
		
		return student;
	}

}
