package com.builder.builderEx3;

public class MediumPepsi extends Pepsi {

	@Override
	public float price() {
		return 35.0f;
	}

	@Override
	public String name() {
		return "500ml Pepsi";
	}

	@Override
	public String size() {
		return "Medium Size";
	}

}
