package com.builder.builderEx3;

public class SmallCoke extends Coke {

	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "300ml Coke";
	}

	@Override
	public String size() {
		return "Small Size";
	}

}
