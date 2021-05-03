package com.oops_encapsulation;

public class TestClass {

	public static void main(String[] args) {
		
		CollegeDetails objCollegeDetails = new CollegeDetails();
		//System.out.println(objCollegeDetails.IntRollNo);
		
		objCollegeDetails.setIntRollNo(11);
		System.out.println("Student Roll no is:" +objCollegeDetails.getIntRollNo());
		
		objCollegeDetails.setStrStudentName("Nishant");
		System.out.println("Student Name is:" +objCollegeDetails.getStrStudentName());
		
		objCollegeDetails.setIntAge(20);
		System.out.println("Student Age is:" +objCollegeDetails.getIntAge());
		
		objCollegeDetails.setStrCityName("Pune");
		System.out.println("Student City is:" +objCollegeDetails.getStrCityName());
		
		}

}
