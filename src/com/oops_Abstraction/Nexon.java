package com.oops_Abstraction;

public class Nexon extends CarDetails {
	
	Nexon(String strCarModel,String strOwnerName,String strIdentificationNo,String strServiceHistory){
		super(strCarModel,strOwnerName,strIdentificationNo,strServiceHistory);
		}
	
	@Override
	void displayCarDetails() {
		
		System.out.println("This is abstract method");
		System.out.println("Car Model is:"+strCarModel);
		System.out.println("Car Owner Name is:"+strOwnerName);
		}
}