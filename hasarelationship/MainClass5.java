package com.jspiders.hasarelationship;
class Account
{
  void withdraw()
  {
	  System.out.println("Withdraw 10000");
  }
}
class Customer
{
   Account acc=new Account();	
 }
class Bank
{
  Customer cu=new Customer();	
}
public class MainClass5 
{
  public static void main(String[] args) 
  {
	  Bank ban=new Bank();
	  ban.cu.acc.withdraw();
  }
}
