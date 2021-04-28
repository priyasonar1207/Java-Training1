package com.conditionalstatements;


public class Ifelseif {
	
	public void verifycollegename(String strClgName)
	{
		if(strClgName.equals("Colonel's Academy"))
		{
			System.out.println("Colonel's Academy");
		}
		
		else if(strClgName.equals("Army Public School"))
		{
			System.out.println("Army Public School");
		}
		else
		{
			System.out.println("Invalid College Name");
		}
	}
	
	
	public static void main(String[] args)
	
	{
	Ifelseif objIfelseif = new Ifelseif();
	objIfelseif.verifycollegename("Army Public School");
		}
}
