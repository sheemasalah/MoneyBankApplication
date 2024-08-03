package com.cg.gobankapp.application;

import com.cg.gobankapp.framework.BankFactory;
import com.cg.gobankapp.framework.CurrentAcc;
import com.cg.gobankapp.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		MMSavingAcc mmsave = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return null;
	}


}
