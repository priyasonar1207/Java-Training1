package com.arraynumbers;


public class Arrayprint {


	public void printarraydata()
	
	{
		int arrAge[]  = {4,12,14,15,18,20};
		

		   
		   System.out.println("Accessing Elements of Array:");
		   System.out.println("First Element: " + arrAge[0]);
		   System.out.println("Second Element: " + arrAge[1]);
		   System.out.println("Third Element: " + arrAge[2]);
		   System.out.println("Fourth Element: " + arrAge[3]);
		   System.out.println("Fifth Element: " + arrAge[4]);
		   System.out.println("Fifth Element: " + arrAge[5]);
			
				
	}

	public static void main(String[] args) {
		
		Arrayprint objArrayprint=new Arrayprint();
		objArrayprint.printarraydata();

	}

}
