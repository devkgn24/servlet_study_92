package lec07_mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	public static SqlSession getSqlSession() {
		
		try {
			// 1. SqlSessionFactoryBuilder
			// mybatis-config.xml의 설정 정보를 통해 객체 생성
			String path = "/mybatis-config.xml";
			InputStream is = Resources.getResourceAsStream(path);
			
			SqlSessionFactoryBuilder sfb 
				= new SqlSessionFactoryBuilder();
			
			// 2. SqlSessionFactory 객체 생성
			// SqlSessionFactoryBuilder의 build() 메소드 활용
			// 매개변수로 mybatis-config.xml 파일 정보 전달
			SqlSessionFactory factory = sfb.build(is);
			
			// 3. SqlSession 객체 생성
			// SqlSessionFactory의 openSession() 메소드 사용
			// 
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
