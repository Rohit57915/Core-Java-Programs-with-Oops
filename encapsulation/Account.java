package com.jspiders.encapsulation;

import java.io.Serializable;

public class Account implements Serializable {
   private long accountNumber;
   private double accountBalance;
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
   
   
}
