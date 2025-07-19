package com.jspiders.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
   	int eid;
   	double ctc;
}
public class MainClass13 {
public static void main(String[] args) {
	    Employee  emp=new Employee();
	    emp.eid=101;
	    emp.ctc=4.5;
	    FileOutputStream fos=null;
	    ObjectOutputStream oos=null;
	    
	    try {
	    	fos= new FileOutputStream("c:/FILEIO/repository.txt");
	    	oos=new ObjectOutputStream(fos);
	    	oos.writeObject(emp);
	    	System.out.println("Serializable Completed");
	    }
	    catch(IOException e){
	    	e.printStackTrace();
	    }
	    finally {
	    	try {
	    		oos.close();
	    		fos.close();
	    		}
	    	catch(IOException e){
	    		e.printStackTrace();
	    	}
	    }
}
}
