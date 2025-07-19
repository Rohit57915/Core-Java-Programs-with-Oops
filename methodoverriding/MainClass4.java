package com.jspiders.methodoverriding;
class FacebookOld
{
   void reaction()
   {
	   System.out.println("like");
   }

}
class FacebookNew extends FacebookOld
{
	@Override
    void reaction()
    {
    	System.out.println("like,love,care,hahha,wow..");
    }
}
public class MainClass4 {
   public static void main(String[] args) {
	FacebookOld fo=new FacebookOld();
	fo.reaction();
	
	FacebookNew fn=new FacebookNew();
	fn.reaction();
	
	FacebookOld f1=new FacebookNew();
	f1.reaction();
}
}
