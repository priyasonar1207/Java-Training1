package com.oops_Abstraction;

public abstract class CarDetails {


	String strCarModel;
	String strOwnerName;
	String strIdentificationNo;
	String strServiceHistory;
	
	CarDetails(String strCarModel,String strOwnerName,String strIdentificationNo,String strServiceHistory)
	{
		this.strCarModel=strCarModel;
		this.strOwnerName=strOwnerName;
		this.strIdentificationNo=strIdentificationNo;
		this.strServiceHistory=strServiceHistory;
		System.out.println("Available Cars are:");
	}
	//Abstract Method
	abstract void displayCarDetails();
	
	//NonAbstract Method
	public void displayRegistrationDetails() {
		System.out.println("Registration Details:");
		System.out.println("Car Identification No is:"+strIdentificationNo);
		System.out.println("Car Service History is:"+strServiceHistory);
	  
    }
	
}
