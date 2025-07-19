package com.jspiders.instanceofkeyword;

public class Flipkart 
{
    static void addToKart(Product p)
    {
    	if(p!=null)
    	{
    		if(p instanceof Mobile)
    		{
    			System.out.println("Mobile Added");
    		}
    		else if(p instanceof Television)
    		{
    			System.out.println("Televison added");
    		}
    		else if(p instanceof Product)
    		{
    			System.out.println("Product Added");
    		}
    	}
    }
}
