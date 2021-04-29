package com.arraynumbers;

public class Assignment22 {

	 String strActualDay[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
     String strExpectedArray[] = {"Sunday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    
		public  void checkequality() {
         {
	        		 for(int intIndex= 0; intIndex < strActualDay.length; intIndex++) 
	        		 
	        		 {
	        			 if(strActualDay[strActualDay.length].equals(strExpectedArray[strExpectedArray.length]))
	        			 
	        			 {
	        		         if(strExpectedArray[intIndex].equals("Sunday")) {
	    	        			 continue;}
	        				 
	        				 else if(strExpectedArray[intIndex].equals("Monday")) {
	        			         System.out.println("Week Starting");}
	    		    	 
	        		         else if(strExpectedArray[intIndex].equals("Tuesday")) {
	        			          System.out.println("Work Started");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("Wednesday")) {
	        			         System.out.println("Work in progress");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("Thursday")) {
	        			         System.out.println("Work finish");}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("Friday")) {
	        			       break;}
    		    	 
	        		         else if(strExpectedArray[intIndex].equals("Saturday")) {
	        			         System.out.println("Party Day");}
	        			 }
	        			 else
	        			 {
	        				 System.out.println("Invalid");
	        			 }
	      }
	 }
}
	       public static void main(String args[]) {
	        	 
	    	 Assignment22 objAssignment22=new Assignment22();
	    	 objAssignment22.checkequality();
   }
}	
	    		    
	    		         
	            
	  			
	    		    
	    		
	     
	     