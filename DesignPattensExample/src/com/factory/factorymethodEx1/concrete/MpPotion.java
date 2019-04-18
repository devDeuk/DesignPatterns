package com.factory.factorymethodEx1.concrete;

import com.factory.factorymethodEx1.framework.Item;

public class MpPotion implements Item {

	@Override
	public void use() {
		System.out.println("마력 회복");
		
	}


}
