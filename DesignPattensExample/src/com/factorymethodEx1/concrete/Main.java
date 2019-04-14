package com.factorymethodEx1.concrete;

import com.factorymethodEx1.framework.Item;
import com.factorymethodEx1.framework.ItemCreator;

public class Main {

	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		
		item.use();
		
		System.out.println("=====================================================");
		
		creator = new MpCreator();
		item = creator.create();		
		
		item.use();
		System.out.println("=====================================================");
		
	}

}
