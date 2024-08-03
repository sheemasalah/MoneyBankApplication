package com.cg.gobankapp.application;

import com.cg.gobankapp.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL=50.0f;
	
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}


	public void withdraw(float accBal){
		System.out.println("Amount is debited and balamce is: "+accBal);
	}


	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}


	

}
