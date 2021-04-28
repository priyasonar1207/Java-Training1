package com.arraynumbers;

public class JBreak {

	public static void main(String[] args) {
		

		int  arrAge[] = new int[4];
			
			arrAge[0]=10;	
			arrAge[1]=20;	
			arrAge[2]=30;	
			arrAge[3]=40;
			
			for (int intIndex = 0; intIndex <=arrAge.length; intIndex++)
	        {
				
	           if (intIndex== 2) {
	               break;
	           }      
	           System.out.println(arrAge[intIndex]);
		       }
			
	}}
		      
