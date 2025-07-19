package com.jspiders.abstract1;

import java.nio.file.Watchable;

abstract class Hotstar {
  void login()
  {
	  System.out.println("Login Success");
  }
  abstract void watch();
}
class HotstarFree extends Hotstar
{
   @Override
void watch() {
	// TODO Auto-generated method stub
	System.out.println("Ad+ Trailer");
}
}
 class HotstarVip extends Hotstar
   {
	   @Override
	   void watch()
	   {
		// TODO Auto-generated method stub
             System.out.println("Ad+Regional");
	}
 }
 class HotstarPrimium extends Hotstar
 {
	 @Override
	void watch() {
		// TODO Auto-generated method stub
		System.out.println("All 'Content Access");
	}
 }

