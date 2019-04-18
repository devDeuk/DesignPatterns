package com.strategy.strategyEx1;

/**
 * @Title  게임캐릭터
 * @Class_nme GameCharacter
 * @Packge_name com.strategyEx1
 * @File_name GameCharacter.java
 * @author  devDeuk
 * @Since  2019. 4. 9.
 * @Version  1.0
 * @author devDeuk
 */
public class GameCharacter {

	//접근점 
	private Weapon webpon; //구현
	
	//교환 가능
	public void setWebpon(Weapon webpon) {
		this.webpon = webpon;
	}
	
	public void attack() {
		//델리게이트
		if(webpon == null) {
			System.out.println("주먹공격");
		}else {
			webpon.attack();
		}
	}
	
}
