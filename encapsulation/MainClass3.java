package com.jspiders.encapsulation;

public class MainClass3 {
  public static void main(String[] args) {
	 Credentials obj=new Credentials();
	 obj.setUsername("admin");
	 obj.setPassword("Admin@123");
	 System.out.println("UserName : "+obj.getUsername());
	 System.out.println("Password : "+obj.getPassword());
}
}
