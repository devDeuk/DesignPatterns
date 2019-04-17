package com.builder.builderEx3;

public class LargePepsi extends Pepsi {

	@Override
	public float price() {
		return 50.0f;
	}

	@Override
	public String name() {
		return "750ml Pepsi";
	}

	@Override
	public String size() {
		return "Large Size";
	}

}
