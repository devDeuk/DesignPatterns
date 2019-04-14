package com.templateEx1;

import com.templateEx1.abst.AbstGameConnectHelper;
import com.templateEx1.abst.DefaultGameConnectionHelper;

/*
 * 템플릿 메소드 패턴
 * 
 * 1. 알고리즘을 여러단계로 나눈다
 * 2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
 * 3. 알고리즘을 수행할 템플릿 메소드를 만든다.
 * 4. 하위 클래스에서 나눠진 메소드들을 구현한다.
 * 
 * 
 */
/**
 * @Title  Template Method Pattern
 * @Class_nme Main
 * @Packge_name com.templateEx1
 * @File_name Main.java
 * @author  devDeuk
 * @Since  2019. 4. 14.
 * @Version  1.0
 */
public class Main {


	public static void main(String[] args) {
		AbstGameConnectHelper helper = new DefaultGameConnectionHelper();
		String id ="kkkkk";
		String password = "123456";
		helper.requestConnction(id, password);
		
	}

}
