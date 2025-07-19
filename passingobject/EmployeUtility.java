package com.jspider.passingobject;

import java.util.Scanner;

public class EmployeUtility {
	static void displayEmployeInfo(Employe e)
    {
 	   System.out.println("Employe Id "+e.eid); 
 	   System.out.println("Employe CTC "+e.ctc);
    }
    static Employe createEmploye() {
    	Scanner scn=new Scanner(System.in);
    	System.out.println("Enter the Employe ID");
    	int eid=scn.nextInt();
    	System.out.println("Enter the Employe ctc");
    	double ctc=scn.nextDouble();
    	Employe e=new Employe(eid,ctc);
    	return e;
    	
    }
 	  
}
