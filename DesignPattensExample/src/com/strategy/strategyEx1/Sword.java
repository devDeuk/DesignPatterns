package com.strategy.strategyEx1;

/**
 * @Title  검 
 * @Class_nme Sword
 * @Packge_name com.strategyEx1
 * @File_name Sword.java
 * @author  devDeuk
 * @Since  2019. 4. 9.
 * @Version  1.0
 * @author devDeuk
 */
public class Sword implements Weapon{
	
	@Override
	public void attack() {
		System.out.println("나 검들었다");
	}
}
