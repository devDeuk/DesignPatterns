package com.adapter.adapterEx1;

/**
 * 
 * Atapter Patten  또는 Wrapper Patten
 * 
 * 4 STEP
 * 
 * client class
 * Adapter클래스와 상호 작용합니다.
 *
 * 
 */
public class AdapterPattenDemo {
	
	public static void main(String[] args) {
		
		CreditCard targetInterface = new BankCustomer(); 
		
		targetInterface.giveBankDetails();
		
		System.out.println(targetInterface.getCreditCard());
		
	}
}
