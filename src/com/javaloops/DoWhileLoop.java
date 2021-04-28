package com.javaloops;

public class DoWhileLoop {

	public static void main(String[] args) {
	
		String strArray[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		int intCounter=0;
		
		do {
			
			System.out.println("Day:"+strArray[intCounter]);
			intCounter++;
		}
		
		while(strArray.length<intCounter);
		
	}

}
