package com.strategy;

public class AObj {
	
	
	Ainterface ainterface;
	
	public AObj(){
		ainterface = new AinterfaceImpl();
	}
	
	
	public void funcAA() {
		
		//위임한다.
		ainterface.funcA();
		ainterface.funcA();
		
		System.out.println("---------------------------------------");
		// ~ 기능이 필요합니다. 개발 구현하기
		System.out.println("AA");
		System.out.println("AA");
	}

}
