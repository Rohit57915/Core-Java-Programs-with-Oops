package com.jspiders.objectclass;

public class Square implements Cloneable{
    int side=0;
    
    public static void main(String[] args) throws CloneNotSupportedException
    {
    	Square original=new Square();
    	original.side=100;
    	
    	Square replica=(Square)original.clone();
    	System.out.println(replica.side);
    	
    }
}
