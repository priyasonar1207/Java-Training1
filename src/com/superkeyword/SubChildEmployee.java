package com.superkeyword;

public class SubChildEmployee extends SuperChildPerson {
	
	String strName="Shivani";

	public void displayname() {
		
	System.out.println("Parent Class name:"+super.strName);
	System.out.println("Child Class name:"+strName);
	
	}

	public static void main(String[] args) {
		
		SubChildEmployee objSubChildEmployee = new SubChildEmployee() ;
            objSubChildEmployee.displayname();
	}
}