package com.builder.builderEx3;

public class MediumNonVegPizza extends NonVegPizza {

	@Override
	public float price() {
		return 220.0f;
	}

	@Override
	public String name() {
		return "Non-Veg Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}
}
