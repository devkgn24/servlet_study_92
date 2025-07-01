package com.gn.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gn.common.SessionTemplate;
import com.gn.dto.Student;

public class StudentDao {
	public List<Student> selectAll(){
		// 데이터베이스 접근(MyBatis)
		SqlSession session = SessionTemplate.getSqlSession(true);
		List<Student> list = session.selectList("com.gn.mapper.StudentMapper.selectAll");
		session.close();
		return list;
	}
	
	public Student selectOne(int studentNo) {
		SqlSession session = SessionTemplate.getSqlSession(true);
		Student student = session.selectOne("com.gn.mapper.StudentMapper.selectOne",studentNo);
		session.close();
		return student;
	}
	
	public int insert(Student param){
		SqlSession session = SessionTemplate.getSqlSession(true);
		int result = session.insert("com.gn.mapper.StudentMapper.insert",param);
		session.close();
		return result;
	}
	
	// Service한테 Student를 전달받았어요.
	// 전달받은 정보를 가지고 update 하고 싶어요.
	
	
	
	
	
	
	
	
}
