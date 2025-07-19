package com.jspiders.abstract1;

public class MainClass5 {
   public static void main(String[] args) {
	   SmartPhoneManager.load(new Samsung());
	   SmartPhoneManager.load(new Vivo());
	   SmartPhoneManager.load(new Oppo());
}
}
