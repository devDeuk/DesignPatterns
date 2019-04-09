package com.strategyEx1;

/**
 *  
 *  1. 요구 사항 
 * 
 *   신작 게임에서 케릭터와 무기를 구현해보세요 
 *   
 *   무기는 두가지 종류가 있습니다.
 *   
 *    칼, 검
 *    
 *  https://www.youtube.com/watch?v=UEjsbd3IZvA&t=624s 
 */
/**
 * @Title  설명
 * @Class_nme Main
 * @Packge_name com.strategyEx1
 * @File_name Main.java
 * @author  devDeuk
 * @Since  2019. 4. 9.
 * @Version  1.0
 * @author devDeuk
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GameCharacter character = new GameCharacter();
		
		//세팅되지 않음
		character.attack();

		//칼 공격
		character.setWebpon(new Knife());
		character.attack();
		
		//검 공격
		character.setWebpon(new Sword());
		character.attack();
	}

}
