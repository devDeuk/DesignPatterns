package com.builder.builderEx2;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	
	private List<Packing> items = new ArrayList<Packing>();
	
	public void addItem(Packing packs) {
		items.add(packs);
	}
	
	public void getCost() {
		for(Packing packing : items) {
			packing.price();
			System.out.println("getCost Price : " +  packing.price());
		}
	}
	
	
	public void showItems() {
		for(Packing packing: items) {
			System.out.print("CD name : " +  packing.pack());
			System.out.println(", Price : " +  packing.price());
		}
	}

}
