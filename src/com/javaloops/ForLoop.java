package com.javaloops;

public class ForLoop {

	public static void main(String[] args) {
		
		String strArray[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		for(int intIndex=0; intIndex<strArray.length; intIndex++) {
			
			System.out.println("Days:"+strArray[intIndex]);
		}

	}}
