package com.jspiders.abstractpure;
interface Demo
{
   void test();
   abstract void disp();
}
class Sample implements Demo
{
    @Override
    public void test()
    {
    	System.out.println("excuating test........");
    }
    @Override
    public void disp()
    {
    	System.out.println("execuating disp......");
    }
}
public class MainClass1 {
  public static void main(String[] args) {
	   Demo ref=new Sample();
	   ref.test();
	   ref.disp();
}
}
