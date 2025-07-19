package com.jspiders.objectclass;

public class DataBackup  implements Cloneable 
{

	int size;
	public static void main(String[] args) throws CloneNotSupportedException
    {
        DataBackup obj=new DataBackup();
        obj.size=127;
        
        DataBackup copy=(DataBackup)obj.clone();
        System.out.println(copy.size);
    }
}
