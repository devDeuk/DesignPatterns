package com.strategy.strategyEx2;

/**
 * @Title  Strategy 인터페이스를 구현하는 덧셈 클래스
 * @Class_nme Addition
 * @Packge_name com.strategyEx2
 * @File_name Addition.java
 * @author  devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public class Addition implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a+b;
	}

}
