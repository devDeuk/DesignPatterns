package com.strategy.strategyEx2;

/**
 * @Title Strategy 인터페이스를 구현하여 곱셉 클래스
 * @Class_nme Multiplication
 * @Packge_name com.strategyEx2
 * @File_name Multiplication.java
 * @author  devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public class Multiplication implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a*b;
	}

}
