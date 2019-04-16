package com.prototype.deepshallow;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		
		navi.setName("navi");

		Cat yo = navi;
		yo.setName("yo");
		
		System.out.println(navi.getName());
		System.out.println(yo.getName());
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Dog free = new Dog();
		free.setName("free");
		
		Dog tom = free.copy();
		tom.setName("tom");
		
		System.out.println(free.getName());
		System.out.println(tom.getName());
		
		
		
		
	}

}
