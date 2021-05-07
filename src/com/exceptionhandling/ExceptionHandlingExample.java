package com.exceptionhandling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		//ArithmeticException
		try{
			int inta=30;
	        int intb=0;
		    int intc= inta/intb;
		    System.out.println("Output is"+intc);
		    }
		catch(Exception e){
		
			System.out.println("Cannot divide a number by zero");
	}
		
		
		//Number Format Exception
		try {
			int intnumber = Integer.parseInt("Characters");
			System.out.println("Output:"+intnumber);
			}
			
			catch( Exception e) {
				
				System.out.println("Number Format Exception");
			}
		

	//Array Index Out of Bounds Exception
		try {
			int intArr[]={50,60,70,80};  
			for(int intIndex=0;intIndex<=intArr.length;intIndex++){  
			System.out.println(intArr[intIndex]);  
			} 
	}
			catch(Exception e){
				 System.out.println("Array Index Out of Bounds Exception");
			}
	
	
	}}




