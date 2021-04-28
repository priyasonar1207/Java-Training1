package com.conditionalstatements;

public class Ifelse {

	public void verifyCollegeName(String strClgName)
	{
		if(strClgName.equals("Colonel's Academy"))
		{
			System.out.println("Going to Colonel's Academy");
		}
		else
		{
			System.out.println("Invalid College Name");
		}
	}
	
	
	public static void main(String[] args)
	
	{
		Ifelse objIfelse = new Ifelse();
		objIfelse.verifyCollegeName("Colonel's Academy");
		}
}




