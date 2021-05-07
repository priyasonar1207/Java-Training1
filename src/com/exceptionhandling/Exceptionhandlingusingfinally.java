package com.exceptionhandling;

public class Exceptionhandlingusingfinally {

	public static void main(String[] args) {
		
		//finally 
				try {
					int intnumber = Integer.parseInt("Characters");
					System.out.println("Output:"+intnumber);
					}
			finally {
				
				System.out.println("finally block always get executed");
			}
	}

}
