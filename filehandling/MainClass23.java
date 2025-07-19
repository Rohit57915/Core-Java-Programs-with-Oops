package com.jspiders.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass23 {
	public static void main(String[] args) {
		File ref = new File("C:/Task/Result1.txt");
		boolean flag = ref.exists();
		if(flag == false) {
				try {
					ref.createNewFile();
					System.out.println("File Created");
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		else {
			System.out.println("File Exists");
		}
		BufferedReader ref1 = null;
		BufferedReader ref2 = null;
		PrintWriter ref3 = null;
		
		try {
			ref1 = new BufferedReader(new FileReader("C:/Task/Language.txt"));
			ref3 = new PrintWriter("C:/Task/Result1.txt");
			String val1 = ref1.readLine();
			while(val1!=null) {
				ref3.println(val1);
				val1 = ref1.readLine();
			}
			ref2 = new BufferedReader(new FileReader("C:/Task/Tools.txt"));
			String val2 = ref2.readLine();
			while(val2!=null) {
				ref3.println(val2);
				val2 = ref2.readLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref1.close();
				ref2.close();
				ref3.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}