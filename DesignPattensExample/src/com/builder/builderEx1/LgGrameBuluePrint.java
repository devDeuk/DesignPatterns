package com.builder.builderEx1;

public class LgGrameBuluePrint extends BluePrint {

	private Computer computer;

	public LgGrameBuluePrint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("i7");
	}

	@Override
	public void setRam() {
		computer.setRam("8G");
	}

	@Override
	public void setStorage() {
		computer.setStorage("SSD 256G");
	}

	@Override
	public Computer getComputer() {
		return computer;
	}
	

}
