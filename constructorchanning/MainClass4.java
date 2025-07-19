package com.jspiders.constructorchanning;
class Chocolate 
{
	Chocolate(int a)
	{
		this(6.5);
		System.out.println("silk");
	}
	Chocolate(double b)
	{
		this("abc");
		System.out.println("Munch");
	}
	Chocolate(String s)
	{
		System.out.println("Dairy Milk");
	}
	
}

public class MainClass4
{
public static void main(String[] args)
{
	Chocolate c=new Chocolate(6);
}
}
