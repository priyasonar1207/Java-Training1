package com.interfacedemo;

public class TestClass implements InterfaceExample{

	@Override
	public void display()
	{
		System.out.println("This is the interface Example");
			
	}
	
	public static void main(String[] args) {
		
		System.out.println("Student name is:");
		
		System.out.println(strName);

		TestClass objTestClass = new TestClass();
		objTestClass.display();
		}
 }
