package com.exceptionhandling;

public class Exceptionhandlingusingthrow {
	
	static void  avg() {
		
		try {
			throw new ArithmeticException("abc");
			
		}
		catch(Exception e) {
			
			System.out.println("Exception");
			
		}
	}
		
		public static void main(String[] args) {
			avg();
		}

}
