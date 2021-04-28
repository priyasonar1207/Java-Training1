package com.arraynumbers;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int intArr1[]= {1,2,3,4,5};
		int intArr2[]= new int[intArr1.length];

		for (int intIndex = 0; intIndex < intArr1.length; intIndex++) {     
	        intArr2[intIndex] = intArr1[intIndex];     
	    }      
	      
	      System.out.println("Elements of Arr1");
	      
	      for(int intIndex=0; intIndex<= intArr1.length; intIndex++)
	      {
	    	  System.out.print(intArr1[intIndex]);
	    	  
	      }
	      
	      System.out.println();
	      
	      
	  System.out.println("Elements of Arr2");
	      
	      for(int intIndex=0; intIndex<= intArr1.length; intIndex++)
	      {
	    	  
	    	  System.out.println(intArr2[intIndex]);
	      }
		}

	}
