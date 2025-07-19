package com.jspiders.constructorchanning;
class Delta

{
	Delta()
	{
		this(10);
		System.out.println("Delta() constructer");
	}
	Delta(int a)
	{
		System.out.println("Delta(int) constructer");
	}
}
class Example extends Delta
{
	Example()
	{
		System.out.println("Example() constructer");
	}
	Example(int a)
	{
		this();
		System.out.println("Example(int) constructer ");
	}
			
}

public class MainClass8 {
public static void main(String[] args) {
	Example ref=new Example(4);
}
}
