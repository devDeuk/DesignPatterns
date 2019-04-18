package com.templateEx1.abst;

/**
 * @Title  추상클래스를 이용한 메소트 패턴
 * @Class_nme AbstGameConnectHelper
 * @Packge_name com.templateEx1.abst
 * @File_name AbstGameConnectHelper.java
 * @author  devDeuk
 * @Since  2019. 4. 14.
 * @Version  1.0
 */
public abstract class AbstGameConnectHelper {
	
	//보안 단계 : 보안 관련 부분
	protected abstract String doSecurity(String string); 
	
	//인증 단계 : 사용자 이름 패스워드 일치 여부확인
	protected abstract boolean authentication(String id, String password); 
	
	//권한 단계 : 접속자의  등급을 확인
	protected abstract int authorization(String userName);
	
	//접속 단계 :  접속자에게 커넥션 정보 전달.
	protected abstract String connection(String info);

	//접속구현 [탬플릿 메소드 ]
	public  String requestConnction(String id, String enPassword) {
		
		//1.보안 작업 -> 암호화 된 문자열을 복호화한다.
		String dePassword = doSecurity(enPassword);
		
		//2.인증과정 반환된 내용으로 아이디와 함호를 할당한다.
		if(authentication(id, dePassword)) {
			throw new Error("암호 불일치 ");
		}
		
		//3. 등급을 가져옴
		String userName = "userName";
		int level = authorization(userName);
		
		switch (level) {
		case 0: //게임 매니저
			break;
		case 1:	//유료 회원
			break;
		case 2:	//무료 회원
			break;
		case 3:	//권한 없음
			break;			
		default: //기타
			break;
		}
		
		return connection(level+"");
	}

	
	
}
