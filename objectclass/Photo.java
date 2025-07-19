package com.jspiders.objectclass;

public class Photo implements Cloneable
{

	int size=0;
	public static void main(String[] args) throws CloneNotSupportedException
    {
    	Photo obj=new Photo();
    	obj.size=12;
    	
    	Photo copy=(Photo)obj.clone();
    	System.out.println(copy.size);
    	
    }
	
}
