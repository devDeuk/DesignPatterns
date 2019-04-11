package com.strategyEx2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Title  StrategyPatten 계산기
 * @Class_nme Main
 * @Packge_name com.strategyEx2
 * @File_name Main.java
 * @author  devDeuk
 * @Since  2019. 4. 10.
 * @Version  1.0
 */
public class Main {

	
	public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 값을 입력해주세요 :   ");
		float value1 = Float.parseFloat(br.readLine());
			
		System.out.print("두번째 값을 입력해주세요 :   ");
		float value2 = Float.parseFloat(br.readLine());
		
		System.out.println("첫번째 : "+ value1 +"//두번째 : "+ value2);
		
		//덧셈
		Context context = new Context(new Addition()); 
		System.out.println("덧셈 : " +context.executeStrategy(value1, value2));
		
		//뺄셈
		context = new Context(new Subtraction()); 
		System.out.println("뺄셈 : " +context.executeStrategy(value1, value2));		
		
		//곱셈
		context = new Context(new Multiplication()); 
		System.out.println("곱셈: " +context.executeStrategy(value1, value2));
			
		
		System.exit(0);	
		
		
	}

}
