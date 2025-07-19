package com.jspiders.widening;
 class Foxtrot
	{
		void play(float val)
		{
			  System.out.println("value : "+val);
		}

	}
public class Program2
{
      public static void main(String[] args)
{
    	  Foxtrot fox=new Foxtrot();
	      fox.play(3.5f);
	      fox.play('a');// Auto widening
	      fox.play(15);// auto widening
	      
	
}	
}


