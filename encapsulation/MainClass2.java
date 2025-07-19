package com.jspiders.encapsulation;

public class MainClass2 {
	public static void main(String[] args) {
		Account acc=new Account();
	       acc.setAccountNumber(154455154815151L);
	       acc.setAccountBalance(50000.0);
	       
	       System.out.println("AccountNumber : "+acc.getAccountNumber());
	       System.out.println("AccountBalance : "+acc.getAccountBalance());
	}
       
       
      
}
