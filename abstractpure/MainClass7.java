package com.jspiders.abstractpure;

public class MainClass7 {
  public static void main(String[] args) {
	     DriverManager.registerDriver(new FireFox());
	     DriverManager.registerDriver(new Chrome());
	     DriverManager.registerDriver(new EdgeDriver());
}
}
