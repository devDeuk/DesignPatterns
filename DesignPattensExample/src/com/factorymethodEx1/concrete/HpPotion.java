package com.factorymethodEx1.concrete;

import com.factorymethodEx1.framework.Item;

public class HpPotion implements Item {

	@Override
	public void use() {
		System.out.println("체력 회복!");
	}



}
