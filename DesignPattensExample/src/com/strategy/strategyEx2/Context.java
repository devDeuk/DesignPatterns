package com.strategy.strategyEx2;

/**
 * @Title  Strategy 인터페이스에서 전략 유형을 요청할 클래스 
 * @Class_nme Context
 * @Packge_name com.strategyEx2
 * @File_name Context.java
 * @author  devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public class Context {

	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public float executeStrategy(float num1, float num2) {
		//델리게이트 - delegate 위임 
		return strategy.calculation(num1, num2);
	}
}
