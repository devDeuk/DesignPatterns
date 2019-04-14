package com.factorymethodEx1.concrete;

import com.factorymethodEx1.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복");
		
	}


}
