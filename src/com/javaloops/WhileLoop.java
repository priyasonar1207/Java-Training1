package com.javaloops;

public class WhileLoop {
	public static void main(String[] args) {
		
		String strArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		int intCounter=0;
		
		while(strArray.length>intCounter) {
			
			System.out.println(strArray[intCounter]);
			
			/*if(strArray[intCounter].equals("Thursday"))
			{
				break;
			}*/
			
			intCounter++;
			}

	}}

