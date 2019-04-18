package com.strategy.strategyEx1;


/**
 * @Title 칼 
 * @Class_nme Knife
 * @Packge_name com.strategyEx1
 * @File_name Knife.java
 * @author  devDeuk
 * @Since  2019. 4. 9.
 * @Version  1.0
 * @author devDeuk
 */
public class Knife implements Weapon{
	
	@Override
	public void attack() {
		System.out.println("나 칼 ");
	}
	
}
