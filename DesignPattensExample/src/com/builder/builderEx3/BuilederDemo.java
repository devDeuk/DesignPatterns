package com.builder.builderEx3;

import java.io.IOException;

public class BuilederDemo {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		OrderBuilder builder=new OrderBuilder();
		
		OrderedItems orderedItems= builder.preparePizza();
		
		orderedItems.showItems();
		
		System.out.println("\n");
		
		System.out.println("Total Cost : "+ orderedItems.getCost());
	}
	
	
	
}
