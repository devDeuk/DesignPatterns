package com.adapter.adapterEx2;

/**
 * 1. atapter patten OR Wrapper patten
 *
 *	요구사항
 *	1. 두 수에 대한 다음 연산을 수행하는 객체를 만들어주세요
 *	  1) 수의 두 배의 수를 반화 : twiceOf(Float) : Float
 *    2) 수의 반(1/2)의 수를 반환 : halfOf(Float) : Float
 *
 *  2. 구현 객체 이름은 'Adapter'로 해주세요 
 *  3. Math 클래스에서 두배와 절반을 구하는 함수는 이미 구현되어 있습니다.
 *
 * 
 */
public class adapterEx2Main {

	public static void main(String[] args) {
		
		//client 
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(50f));
		

	}

}
