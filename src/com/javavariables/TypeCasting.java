package com.javavariables;

public class TypeCasting {

public static void main(String[] args) {
		
		int intAge=20;
		String strName="Priyanka";
		
		int intSalary=5000;
		String strVal="10000";
		int intTotalVal;
		
			
		/* System.out.println("The Age is ==>"+intAge);
		 System.out.println("The Name is ==>"+strName);
		 */
		
		int intVal=Integer.parseInt(strVal);
		
			intTotalVal = intSalary + intVal ;
			
			System.out.println("Total Salary ==>"+intTotalVal);
		}
	}


