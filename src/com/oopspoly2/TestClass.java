package com.oopspoly2;

public  class TestClass{
	
	public  static void main(String[] args) {
	
		System.out.println("Test Class:");
		
		MethodOverriding objMethodOverriding= new MethodOverriding();
		MethodOverriding  objStudent= new Student();
		Student objEmployee= new Employee();
		
		objMethodOverriding.displayPerson();
		objStudent.displayPerson();
		objEmployee.displayPerson();
	}
	}
