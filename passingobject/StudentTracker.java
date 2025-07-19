package com.jspider.passingobject;

import java.util.Scanner;

public class StudentTracker {
      static void displayStudentDetails(Student s)
      {
    	  System.out.println("yop : "+s.yop);
    	  System.out.println("Cgpa : "+s.cgpa);
    	  System.out.println("Mobile :"+s.mobile);
      }
      static Student createStudent() {
    	  Scanner scn=new Scanner(System.in);
    	  System.out.println("Enter yop");
    	  int yop=scn.nextInt();
    	  System.out.println("Enter Cgpa");
    	  double cgpa=scn.nextDouble();
    	  System.out.println("Enter Moblile Number");
    	  long mobile=scn.nextLong();
    	  Student s=new Student(yop,cgpa,mobile);
    	  return s;
    	  
      }
}
