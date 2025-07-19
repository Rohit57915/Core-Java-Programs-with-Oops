package com.jspiders.singletonClass;

public class MainClass1
{
    public static void main(String[] args) 
    {
    	
       Connection c1 = Connection.getConnection();
       Connection c2 = Connection.getConnection();
  	
	}
}
