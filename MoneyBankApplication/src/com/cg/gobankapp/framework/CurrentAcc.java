package com.cg.gobankapp.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public float getCreditLimit() {
		return creditLimit;
	}

	public void withdraw(float accBal) {
		System.out.println("Amount is debited and balamce is: "+accBal);
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
}
