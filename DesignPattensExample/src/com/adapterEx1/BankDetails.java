package com.adapterEx1;

/**
 * 
 * Atapter Patten  또는 Wrapper Patten
 * 
 * 2 STEP
 * Adaptee 클래스 : Adapter 클래스가 기존 기능을 재사용하고 원하는 용도로 수정하는데 사용되는 클래스
 *
 */
public class BankDetails {
	
	private String bankName; 
	private String accHolderName;
	private long accNumber;
	
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

}
