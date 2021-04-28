package com.arraynumbers;

public class PrintUsingFor {

	public void printarraydata()
	
	{
		int [] arrAge = {4,12,14,15,18,20};
		

		 for (int intIndex = 0; intIndex < arrAge.length; intIndex++) {
	         System.out.println(arrAge[intIndex] + " ");
	       
	       }
	    }
	      
	public static void main(String[] args) {
		
		PrintUsingFor  objPrintUsingFor =new PrintUsingFor();
		objPrintUsingFor.printarraydata();

	}

}
