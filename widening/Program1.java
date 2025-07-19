package com.jspiders.widening;

public class Program1 {
     public static void main(String[] args) {
		int a=10;
		double d=a;
		System.out.println(d); // Widening : int------>double
		
		char  c='A';
		int x=c;
		System.out.println(x); // Widening : char------>int
		
		float p=12.5f;
		double q=p;
		System.out.println(q); // Widening : float------>double
	}
}
