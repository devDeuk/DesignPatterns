package com.strategyEx2;

/**
 * @Title  Strategy 인터페이스를 구현하는 뺄셈 클래스
 * @Class_nme Subtraction
 * @Packge_name com.strategyEx2
 * @File_name Subtraction.java
 * @author  devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public class Subtraction implements Strategy {

	@Override
	public float calculation(float a, float b) {
		return a-b;
	}

}
