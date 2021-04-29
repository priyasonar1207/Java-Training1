package com.oopsconcepts;

public class JavaConstructor {

	String strName;
	String strPassword;
	
	 public JavaConstructor(){
		 
		 strName="Priyanka"; 
		 strPassword="abc@123";
		 
	 }
	 
	 public void dologin() {
	      
	     System.out.println("Enter the Name: "+strName);
	     
	     System.out.println("Enter the Password: "+strPassword);
	     
	     System.out.println("Click on Login Button");
	     
	     System.out.println("You have successfully logged in");
	    	  
	    	 }
	      
	 public void printdata() {
		 
		 System.out.println("Data is printed");
		 
	 }
		public static void main(String[] args) {
			
			JavaConstructor objJavaConstructor= new JavaConstructor();
			objJavaConstructor.printdata();
			objJavaConstructor.dologin();

		}

	}

	
	