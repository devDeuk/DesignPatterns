package com.builder.builderEx2;

public class BuilderDemo {

	public static void main(String[] args) {
		
		CDBuilder cdBuilder = new  CDBuilder();
		
		CDType cdType1= cdBuilder.buildSonyCD();
		cdType1.showItems();
		cdType1.getCost();
		
		
		CDType cdType2 = cdBuilder.buildSamsungCD();
		cdType2.showItems();
		cdType2.getCost();

	}

}
