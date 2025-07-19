package com.jspiders.filehandling;

import java.io.File;

public class MainClass7 
{
  public static void main(String[] args) {
	  File ref=new File("c:/FILEIO");
	  boolean flag=ref.exists();
	  if(flag==true) {
		  String[] arr=ref.list();
		  for(int i=0;i<arr.length;i++)
		  {
			  File obj=new File(ref,arr[i]);
			  boolean status =obj.isFile();
			  if(status==true) {
			  System.out.println(arr[i]);
			  }
		  }
	  }
}
}