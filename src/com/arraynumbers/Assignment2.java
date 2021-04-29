package com.arraynumbers;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

     String strActualDay[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
     
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the day You want to Verify:");
     
     String strExpectedArray=sc.nextLine();
     System.out.println("You have Entered:"+strExpectedArray);
      
    	switch (strExpectedArray) 
    	{
    		     
    		     case "Sunday":
    		    	 System.out.println("Holiday");
    		    	 break;
    		         
    		     case "Monday":
    		    	 System.out.println("Week starting");
    		         break;
    		         
    		     case "Tuesday":
    		    	 System.out.println("Work started");
    		         break;
    		         
    		     case "Wednesday":
    		    	 System.out.println("Work in Progress");
    		         break;
    		         
    		     case "Thursday":
    		    	 System.out.println("Work Finished");
    		         break;
    		         
    		     case "Friday":
    		    	 System.out.println("Weekend Day");
    		         break;
    		         
    		     case "Saturday":
    		    	 System.out.println("Party Day");
    		         break;
    		         
    		     default:
    		            System.out.println("Error");
    		            break;
    		         }
    	}
}
    			
    		    
    		
     
     