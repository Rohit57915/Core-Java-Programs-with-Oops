package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class MainClass20 {
	public static void main(String[] args) {
		  
		File ref=new File("C:/Task/Tools.txt");
		boolean flag=ref.exists();
		if(flag==false)
		{
			try {
				ref.createNewFile();
				System.out.println("File Created");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("FILE EXISTS");
		}
	   
}
}
