package com.template.templateEx1.abst;

/**
 * @Title  DefaultGameConnectionHelper 접속 로직
 * @Class_nme DefaultGameConnectionHelper
 * @Packge_name com.templateEx1.abst
 * @File_name DefaultGameConnectionHelper.java
 * @author  devDeuk
 * @Since  2019. 4. 14.
 * @Version  1.0
 */
public class DefaultGameConnectionHelper extends AbstGameConnectHelper { 
	@Override
	protected String doSecurity(String string) {
		System.out.println("1. 디코드 영역입니다.");
		System.out.println("password :" + string);
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("2. 아이디/암호 확인 과정");
		System.out.println("id :" + id+"	// password :" + password);
		return false;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("3. 권한 확인");
		System.out.println("userName :" + userName);
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("level :" + info);
		System.out.println("4. 마지막 접속 단계 ");
		
		return null;
	}

}
