package com.jspiders.filehandling;

import java.io.File;

//DELETE A FILE/FOLDER
public class MainClass3 {
public static void main(String[] args) {
	File ref=new File("c:/FILEIO/Demo.txt");
	boolean flag=ref.exists();
	if(flag==true) {
		ref.delete();
		System.out.println("Deleted");
	}
	else {
		System.out.println("Not Found");
	}
  }
}
