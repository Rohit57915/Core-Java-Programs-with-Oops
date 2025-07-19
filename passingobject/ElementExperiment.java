package com.jspider.passingobject;

import java.util.Scanner;

public class ElementExperiment {
             static void displayElementExperiment(Element a) {
            	 System.out.println("Experimrent Id "+a.id);
            	 System.out.println("Experiment Number "+a.expnum);
             }
             static Element createElement() {
            	 Scanner scn=new Scanner(System.in);
            	 System.out.println("Enter Id");
            	 int id=scn.nextInt();
            	 System.out.println("Enter ExpNum");
            	 int expnum=scn.nextInt();
            	 Element a=new Element(id,expnum);
            	 return a;
             }
}
