package com.jspiders.abstract1;

public class MainClass4 {
  public static void main(String[] args) {
	    AccessManager.controlAccess(new HotstarFree());
	    AccessManager.controlAccess(new HotstarVip());
	    AccessManager.controlAccess(new HotstarPrimium());
}
}
