package com.cg.gobankapp.client;

import com.cg.gobankapp.application.*;
import com.cg.gobankapp.framework.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory bf= new MMBankFactory();
		SavingAcc sa= new MMSavingAcc(1,"Aaqib",200000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca = new MMCurrentAcc(2,"Khan",40000,500);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
