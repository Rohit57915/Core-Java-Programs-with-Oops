package com.jspiders.abstractpure;

public class MainClass6 {
  public static void main(String[] args) {
	    Kannada k=new Kannada();
	    Hindi h=new Hindi();
	    English e=new English();
	    
	    GoogleTranslate.translate(k, h);
	    GoogleTranslate.translate(e, k);
	    GoogleTranslate.translate(h, e);
}
}
