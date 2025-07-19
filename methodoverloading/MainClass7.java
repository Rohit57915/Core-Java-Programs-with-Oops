package com.jspiders.methodoverloading;
class FaceBook
{
  void login(String username)
  {
	  System.out.println("Login with UserName");
  }
  void login(int password)
  {
	  System.out.println("Login with Password");
  }
  void login(long mobileNumber,String password)
  {
	  System.out.println("Login with Mobile Number");
  }
}
public class MainClass7
{
 public static void main(String[] args)
 {
      FaceBook fb=new FaceBook();
      fb.login("pavan");
      fb.login("pavan123");
      fb.login(1554554,"pavan123");
 }
}
