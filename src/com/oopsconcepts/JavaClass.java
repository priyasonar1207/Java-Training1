package com.oopsconcepts;

public class JavaClass {
	
      String strEmailid="priyasonar@gmail.com";
      String strPassword="abcd@1234";
      
      public void dologin() {
      
     System.out.println("Enter the Mail id: "+strEmailid);
     
     System.out.println("Enter the Password: "+strPassword);
     
     System.out.println("Click on Login Button");
     
     System.out.println("You have successfully logged in.Welcome to Gmail");
    	  
    	 }
      
	public static void main(String[] args) {
		
		JavaClass objJavaClass= new JavaClass();
		objJavaClass.dologin();

	}

}
