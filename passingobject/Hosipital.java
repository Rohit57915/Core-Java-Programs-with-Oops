package com.jspider.passingobject;

import java.util.Scanner;

public class Hosipital {
	        static void displayHospitalInfo(Patient p) {
	        	System.out.println("Patient Id "+p.pid);
	        	System.out.println("Patient Age "+p.age);
	        	System.out.println("Patient Addhar "+p.addhar);
	        }
	        static Patient createPatient() {
	        	Scanner scn=new Scanner(System.in);
	        	System.out.println("Enter Patient Id");
	        	int pid=scn.nextInt();
	        	System.out.println("Enter Patient Age");
	        	int age=scn.nextInt();
	        	System.out.println("Enter Patient Addhar");
	        	int addhar=scn.nextInt();
	        	Patient p=new Patient(pid,age,addhar);
	        	return p;
	        }
	        

}
