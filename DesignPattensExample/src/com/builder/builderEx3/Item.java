package com.builder.builderEx3;

/**
 * @Title  빌더패턴 1step : 피자와 차가운 음료를 나타내는 인터페이스 항목을 만듭니다.
 * @Class_nme Item
 * @Packge_name com.builder.builderEx3
 * @File_name Item.java
 * @author  devDeuk
 * @Since  2019. 4. 17.
 * @Version  1.0
 */
public interface Item {
	public String name();
	public String size();
	public float price();
}
