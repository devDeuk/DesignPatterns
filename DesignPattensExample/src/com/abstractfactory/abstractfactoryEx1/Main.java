package com.abstractfactory.abstractfactoryEx1;

import com.abstractfactory.abstractfactoryEx1.Sam.SamFactory;

public class Main {

	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel =factory.createWheel();
		
		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
	}

}
