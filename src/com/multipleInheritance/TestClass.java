package com.multipleInheritance;

class TestClass implements MultipleInheritanceExample, Parent, Child{
	
public void display() {
		
	MultipleInheritanceExample.super.display();
		Parent.super.display();
		Child.super.display();
	}

public static void main(String[] args) {
		
TestClass objTestClass = new TestClass ();
objTestClass.display();
	
     }
}
