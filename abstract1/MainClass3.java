package com.jspiders.abstract1;
abstract class Delta
{
    void send(){
	System.out.println("Excuating send.....");
    }	
    void help()
    {
    	System.out.println("Excecuating help.....");
    }
}
class Example extends Delta
{
	
}
public class MainClass3 {
public static void main(String[] args) {
	Delta ref=new Example();
	ref.send();
	ref.help();
}
}
