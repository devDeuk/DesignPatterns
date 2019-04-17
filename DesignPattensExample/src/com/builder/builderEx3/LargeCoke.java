package com.builder.builderEx3;

public class LargeCoke extends Coke {

	@Override
	public float price() {
		return 50.0f;
	}

	@Override
	public String name() {
		return "750ml Coke";
	}

	@Override
	public String size() {
		return "Large Size";
	}

}
