package com.strategy.strategyEx2;

/**
 * @Title  전략인터페이스 
 * @Class_nme Strategy
 * @Packge_name com.strategyEx2
 * @File_name strategy.java
 * @author devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public interface Strategy {

	 /**
	 * <pre>
	 * 
	 * 계산 기능을 선언한다.
	 *  
	 * @Method name : calculation
	 * @param a
	 * @param b
	 * @return
	 * @See
	 *
	 * == Modification Information ==
	 *
	 * DATE   		 AUTHOR  	NOTE
	 * --------- 	 --------- --------------------------------------
	 * 2019. 4. 10.  devDeuk  	최초 생성
	 *
	 * </pre>
	 */
	public float calculation(float a, float b);
}
