package com.builder.builderEx3;

public class ExtraLargeOnionPizza extends VegPizza {

	@Override
	public float price() {
		return 180.0f;
	}

	@Override
	public String name() {
		return "Onion Pizza";
	}

	@Override
	public String size() {
		return "Large Size";
	}

}
