package com.javavariables;

public class JavaVariables {


	int intamt= 500;
	int intTotalamt;
	
	public void doAmtCalculation()
	{
		int intadditionalcharges=100;
		
		int intTotalamt = intamt + intadditionalcharges ;
		
		System.out.println("Total Bill ==>"+intTotalamt);
	}

	
	public static void main(String[] args) 
	
	{
		
JavaVariables objJavaVariables = new JavaVariables();	
objJavaVariables.doAmtCalculation();

}
}