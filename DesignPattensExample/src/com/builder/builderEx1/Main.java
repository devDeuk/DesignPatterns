package com.builder.builderEx1;

import javax.xml.stream.FactoryConfigurationError;

public class Main {
	
	public static void main(String[] args) {
		
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGrameBuluePrint());
		factory.make();
		Computer computer= factory.getComputer();
		System.out.println(computer.toString());
		
		
		/*
		Computer computer=new Computer("i7", "16G", "SDD 256G");
		System.out.println(computer.toString());
		*/
	}
}
