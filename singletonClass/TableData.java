package com.jspiders.singletonClass;

public class TableData 
{
   private static TableData td=new TableData();
   public static TableData getTableData()
   {
	   if(td==null)
	   {
		   td=new TableData();
	   }
	   return td;
   }
   private TableData()
   {
	   System.out.println("Execuating TableData()........");
   }
}
// Enthuazi Initialization