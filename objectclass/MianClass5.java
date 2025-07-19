package com.jspiders.objectclass;
class CreditCard
{ 
    private long CardNumber =548418441548L;
    private int pin=1234;
    @Override
    public boolean equals(Object obj)
    {
    	CreditCard c=(CreditCard)obj;
    	if(this.CardNumber==c.CardNumber && this.pin==c.pin)
    	{
    		return true;
    		
    	}
    	else
    	{
    		return false;
    	}
    }
}
public class MianClass5 
{
     public static void main(String[] args) 
     {
	   CreditCard c1=new CreditCard();
	   CreditCard c2=new CreditCard();
	   System.out.println(c1.equals(c2));
	}
}
