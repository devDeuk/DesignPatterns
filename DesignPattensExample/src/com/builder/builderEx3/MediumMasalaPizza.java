package com.builder.builderEx3;

public class MediumMasalaPizza extends VegPizza {

	@Override
	public float price() {
		return 120.0f;
	}

	@Override
	public String name() {
		return "Masala Pizza";
	}

	@Override
	public String size() {
		return "Medium Size";
	}

}
