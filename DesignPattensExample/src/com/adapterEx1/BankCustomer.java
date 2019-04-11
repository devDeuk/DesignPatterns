package com.adapterEx1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Atapter Patten  또는 Wrapper Patten
 * 
 * 3 STEP
 * Adapter 클래스 : 원하는 대상 인터페이스를 구현하고 Adaptee 클래스에서 사용할 수 있는 특정 요청을 수정하는 래퍼 클래스 
 *
 */
public class BankCustomer extends BankDetails implements CreditCard {
	
	public void giveBankDetails() {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		

			System.out.print("Enter the account holder name :");  
			String customername=br.readLine();  
			System.out.print("\n");  
			      
			System.out.print("Enter the account number:");  
			long accno=Long.parseLong(br.readLine());  
			System.out.print("\n");  
			
			String bankname = br.readLine();
			System.out.print("Enter the bank name :");  
			  			
			
			setBankName(bankname);
			setAccHolderName(customername);
			setAccNumber(accno);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getCreditCard() {
		
		long accno = getAccNumber();
		String accholdername = getAccHolderName();
		String bname = getBankName();
		
		return ("The Account number "+accno+" of "+accholdername+" in "+bname+ "bank is valid and authenticated for issuing the credit card. ");
	}

}
