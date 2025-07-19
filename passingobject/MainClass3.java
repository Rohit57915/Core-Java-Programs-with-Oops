package com.jspider.passingobject;

public class MainClass3 {
	public static void main(String[] args)
	{
    Student s1=StudentTracker.createStudent();
    StudentTracker.displayStudentDetails(s1);
    
    Student s2=StudentTracker.createStudent();
    StudentTracker.displayStudentDetails(s2);
    
    Student s3=StudentTracker.createStudent();
    StudentTracker.displayStudentDetails(s3);
    
	}
}