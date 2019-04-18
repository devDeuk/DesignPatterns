package com.strategy.strategyEx3;

/**
 * 
 * 1.강 Strategy Patten (스트래티지 패턴, 전략 패턴)
 * 
 * 여러 알고리즘을 하나의 추상적인 접근점을 만들어 접근 점에서 교환가능하도록 하는 패턴
 * 
 * @author ksd83
 *
 */
public class Main {


	public static void main(String[] args) {
		
		Ainterface ainterface = new AinterfaceImpl();
		
		//통로 
		ainterface.funcA();
		
		AObj aObj = new AObj();
		aObj.funcAA();
		
		
	}

}
