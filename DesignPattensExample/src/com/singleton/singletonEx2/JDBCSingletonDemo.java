package com.singleton.singletonEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class JDBCSingletonDemo {

	public static void main(String[] args) {
		
		JDBCSingleton2 jdbcSingleton = JDBCSingleton2.getInstance();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("이름을 입력하세요");
			String username = br.readLine();

			System.out.print("비밀번호를 입력하세요");
			String userpass = br.readLine();
			
			try {
				int i = jdbcSingleton.insert(username, userpass);
				System.out.println( "i :"+ i);
				
				if(i > 0) {
					System.out.println( "정상으로 저장하였습니다");
				}else {
					System.out.println( "저장하지 못했습니다.");
				}
				
				jdbcSingleton.view(username);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
