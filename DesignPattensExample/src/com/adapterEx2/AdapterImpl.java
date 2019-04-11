package com.adapterEx2;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*
 	3step
 	
	Adapter 클래스 : 원하는 대상 인터페이스를 구현하고 Adaptee 클래스에서 사용할 수 있는 특정 요청을 수정하는 래퍼 클래스
 */
public class AdapterImpl implements Adapter {

	Math math;
	
	@Override
	public Float twiceOf(Float f) {

		math = new Math();
		
		return (float) math.twoTime(f);
	}

	@Override
	public Float halfOf(Float f) {
		math = new Math();
		
		System.out.println("half 함수 호출");
		return (float) math.half(f);
	}

}
