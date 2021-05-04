package com.comparestrings;

public class StringComparision {
	
	static String strName="Priya";
	static String strName1="Priya";
	
	static String strName3= new String("Priya");
	static String strName4= new String("Ankita");

	public static void main(String[] args) {
		
		//compares content of both the strings
		
		System.out.println("Compare Strings using .equals");
		System.out.println(strName.equals(strName1));
		System.out.println(strName.equals(strName3));
		System.out.println(strName.equals(strName4));
		
		System.out.println("=================================================================");
		
		//checks reference of both strings objects
		//prints true if variables points towards same java object
		
		System.out.println("Compare Strings using ==");
		System.out.println(strName==strName1);
		System.out.println(strName==strName3);
		System.out.println(strName3==strName4);
	}

}
