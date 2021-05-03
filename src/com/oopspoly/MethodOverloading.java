package com.oopspoly;

public class MethodOverloading {
			
			public static void displayinputs( String strEmailid, String strUsername) {
				 
				System.out.println("Emailid:"+strEmailid);
				System.out.println("Username:"+strUsername);
				
			}
			public static void displayinputs( String strEmailid, String strUsername,String strPassword)
			{
				System.out.println("Emailid:"+strEmailid);
				System.out.println("Username:"+strUsername);
				System.out.println("Password:"+strPassword);
			
	}

}
