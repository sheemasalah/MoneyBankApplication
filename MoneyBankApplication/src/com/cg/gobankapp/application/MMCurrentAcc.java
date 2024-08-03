package com.cg.gobankapp.application;

import com.cg.gobankapp.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float creditLimit){
		System.out.println("Your credit limit is: "+creditLimit+" your current balance is: "+ getAccBal());
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
}
