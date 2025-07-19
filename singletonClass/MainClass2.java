package com.jspiders.singletonClass;

public class MainClass2 
{
  public static void main(String[] args)
  {
	 TableData t1=TableData.getTableData();
	 TableData t2=TableData.getTableData();
	 TableData t3=TableData.getTableData();
  }
}
