package com.gn.mapper;

import java.util.List;

import com.gn.dto.Student;

public interface StudentMapper {
	List<Student> selectAll();
	
	Student selectOne(int studentNo);
	
	int insert(Student param);
	
	// 메소드명 : updateStudent
	// 반환형 : int
	// 매개변수 : Student student
}
