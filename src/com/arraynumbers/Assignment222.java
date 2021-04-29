package com.arraynumbers;

public class Assignment222 {

	 String strActualDay[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
     String strExpectedArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    
		public  void checkequality() {
         {
	        		 for(int intIndex= 0; intIndex < strActualDay.length; intIndex++) 
	        		 
	        		 {
	        				 
	        				 if(strExpectedArray[intIndex].equals("Monday")) {
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
	        		 
	        		         else if(strExpectedArray[intIndex].equals("Sunday")) {
	        		        	 continue;}
	        		          else
	        			      {
	        				     System.out.println("Invalid");
	        			      }
	        		 }
	      }
	 }

	       public static void main(String args[]) {
	        	 
	    	 Assignment222 objAssignment222=new Assignment222();
	    	 objAssignment222.checkequality();
   }
}	
	    		    
	    		         
	            
	  			
	    		    
	    		
	     
