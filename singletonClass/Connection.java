package com.jspiders.singletonClass;
public class Connection
{
  private static Connection con=null;
  
  public static Connection getConnection()
  {
	  if(con==null)
	  {
		  con=new Connection();
	  }
	  return con;
  }
 private Connection()
 {
	 System.out.println("Executing ......");
 }
}

