package com.arraynumbers;
import java.util.Scanner;

public class StrArrAssignment1 {
    Scanner sc=new Scanner(System.in);
    
	 String strActualDay[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
     String strExpectedArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    
    public int arrayValidation(){
    
        int flag=0;
         
         for(String strIndexActualarr:strActualDay){
             for(String strIndexExpextedarr:strExpectedArray){
               if(strIndexActualarr.equals(strIndexExpextedarr)){
                  flag = 1;  
               }
               else{
               
                   flag=0;
               }
             }}
                 
		return flag;} 
             
		public  void displaydayname() {
         
			System.out.println("Enter day :");
	       String strActualDay=sc.next();
	        
	        		 for(int intIndex= 0; intIndex < strExpectedArray.length; intIndex++) 
	        		 
	        		 {
	        				 
	        				  if(strExpectedArray[intIndex].equals(strActualDay)){
                                if(strActualDay.equals("Monday"))
                                 System.out.println("work started");
	    		    	 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Tuesday"))
	        			          System.out.println("Work in progress");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Wednesday"))
	        			         System.out.println(" Work finish");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Thursday"))
	        			         System.out.println("Break");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Friday"))
	        			       System.out.println("Weekend day");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Saturday"))
	        			         System.out.println("Party Day");}
	        		 
	        		         else if(strExpectedArray[intIndex].equals("strActualDay")) {
	        		         if(strActualDay.equals("Sunday"))
	        		        	 System.out.println("Continue");}
	        		          else
	        			      {
	        				     System.out.println("Invalid");
	        			      }
	        		 }}
					}

	       public static void main(String args[]) {
	        	 
	    	   StrArrAssignment1 objStrArrAssignment=new  StrArrAssignment1();
	    	 int intcheck=  objStrArrAssignment.arrayValidation();
	    	 
	    	 if(intcheck==1) {
	    		 objStrArrAssignment.displaydayname();
   }
	    	 else {
	    	System.out.println("Invalid day");
	    		 
	    	 }
	    	 }
}	
	    		    
		         
	            
	  			
	    		    
	    		
	     
