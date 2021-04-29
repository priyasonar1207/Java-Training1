package com.oopsconcepts;

public class InheritedClass extends JavaInheritance {

	public void verifyUserAge() {
	      
		int intAge=20;
		
		     System.out.println("User Age: "+ intAge);
		     
		     if(intAge>=18) {
		     
		     System.out.println("Valid age");
		     }
		     else {
		     System.out.println("Invalid age");
		 }}
		      
			public static void main(String[] args) {
				
			
				InheritedClass objInheritedClass= new InheritedClass();
				objInheritedClass.dologin();
				objInheritedClass.verifyUserAge();
				
				
			}}