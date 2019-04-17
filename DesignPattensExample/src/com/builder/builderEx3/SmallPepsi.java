package com.builder.builderEx3;

public class SmallPepsi extends Pepsi {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "300ml Pepsi";
	}

	@Override
	public String size() {
		return "Small Size";
	}

}
