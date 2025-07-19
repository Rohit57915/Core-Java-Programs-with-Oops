package com.jspiders.filehandling;

import java.io.File;

public class MainClass6 
{
  public static void main(String[] args) {
	  File ref=new File("c:/FILEIO");
	  boolean flag=ref.exists();
	  if(flag==true) {
		  String[] arr=ref.list();
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.println(arr[i]);
		  }
	  }
}
}
