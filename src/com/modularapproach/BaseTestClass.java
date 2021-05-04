package com.modularapproach;

public class BaseTestClass {

			
	public void initialiseWebEnvironment(String strUrl) {
      System.out.println("BaseTestClass initialiseWebEnvironment method");
		System.out.println("Facebook is opening:"+strUrl);	
	}
	
	public void closeBrowser() {
	System.out.println("BaseTestClass closeBrowser Method");
		System.out.println("Browser is closed");	
	}
	
	}

