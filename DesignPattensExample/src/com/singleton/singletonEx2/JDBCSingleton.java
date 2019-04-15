package com.singleton.singletonEx2;

import java.sql.Connection;
import java.sql.DriverManager;

class JDBCSingleton {
	//1단계
	//JDBCSingleton 클래스를 만듭니다.
	//정적 멤버는 JDBCSingleton 클래스의 인스터스 하나만 보유합니다.
	 private static JDBCSingleton instance;
	 
	 //JDBCSingleton은 다른 클래스에서 인스턴스화 방지합니다.
	 private JDBCSingleton() {}
	 

	 //싱글톤 access 영역
	 public static JDBCSingleton getInstance() {
		if(instance == null) {
			instance = new JDBCSingleton();
		}
		return instance;
	}

	private static Connection getConneion() {
		
		Connection con = null;
		//Class.forName("");
		//con=DriverManager.getConnection("", user, password);
		return con;
	}
	 
	
}
