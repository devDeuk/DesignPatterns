package com.abstractfactory.abstractfactoryEx1.Sam;

import com.abstractfactory.abstractfactoryEx1.BikeFactory;
import com.abstractfactory.abstractfactoryEx1.Body;
import com.abstractfactory.abstractfactoryEx1.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		return new SamWheel();
	}

}
