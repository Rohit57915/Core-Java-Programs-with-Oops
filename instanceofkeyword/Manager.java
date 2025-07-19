package com.jspiders.instanceofkeyword;

class Manager 
{
    static void assignWork( SoftwareEngineer e)
    {
    	if(e!=null)
    	{
    		e.meeting();
    		if(e instanceof Developer)
    		{
    			Developer d=(Developer)e;
    			d.coding();
    		}
    		else if(e instanceof Tester)
    		{
    			Tester t=(Tester)e;
    			t.testing();
    		}
    	}
    }
}
