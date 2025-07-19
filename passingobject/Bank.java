package com.jspider.passingobject;

import java.util.Scanner;

public class Bank {
       static void displayAccountInfo(Account a)
       {
    	   System.out.println("Account Number "+a.accountNumber); 
    	   System.out.println("Account Balance "+a.accountBalance);
       }
      
	static Account createAccount() {
    	   Scanner scn=new Scanner(System.in);
    	   System.out.println("Enter Account Number");
    	   long accountNumber=scn.nextLong();
    	   System.out.println("Enter Account Balance");
    	   double accountBalance=scn.nextDouble();
    	   Account a=new Account(accountNumber,accountBalance);
    	   return a;
       }
}
