package com.modularapproach;

public class TestFacebook {

	public static void main(String[] args) {
		
	    VerifyFunctions objVerifyFunctions=new VerifyFunctions();
		Utilities objUtilities = new Utilities();
		FacebookPageObjectClass objFacebookPageObjectClass = new FacebookPageObjectClass();
		BaseTest objBaseTest = new BaseTest();
	
		objBaseTest.initialiseWebEnvironment("Chrome browser");
		
		System.out.println("=============================================================");
		
		objBaseTest.openFacebookUrl("http://www.facebook.com");
		
		System.out.println("=============================================================");
	
		objFacebookPageObjectClass.createNewAccount(objUtilities.getRandomString(8),
				objUtilities.getRandomString(7),objUtilities.getRandomEmailId(),
				objUtilities.getMobileNumber(),objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),objUtilities.getRandomNumber(1990,2020),
				"12345", "female");
		
		
		System.out.println("==============================================================");
		
		objVerifyFunctions.verifySignupwithEmailId(objUtilities.getRandomString(8),
				objUtilities.getRandomString(7),objUtilities.getRandomEmailId(),
				objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),objUtilities.getRandomNumber(1990,2020),
				"12345", "female");
		
		System.out.println("Verified using mail id");
		
		System.out.println("==============================================================");

		objVerifyFunctions.verifySignupwithMobilenumber(objUtilities.getRandomString(8),
				objUtilities.getRandomString(7),objUtilities.getMobileNumber(),objUtilities.getRandomNumber(1,31),
				objUtilities.getRandomNumber(1,12),objUtilities.getRandomNumber(1990,2020),
				"12345", "female");
		
		System.out.println("Verified using Mobile no");
		
		System.out.println("==============================================================");

		objBaseTest.closeBrowser();
		
		}
	
}
