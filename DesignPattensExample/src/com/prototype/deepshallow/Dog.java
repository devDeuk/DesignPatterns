package com.prototype.deepshallow;

public class Dog implements Cloneable{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog copy() throws CloneNotSupportedException {
		Dog ret = (Dog) clone();
		return ret;
	}
	
}
