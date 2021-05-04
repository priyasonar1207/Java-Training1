package com.modularapproach;

public class UtilityClass extends Utilities {

	public static void main(String[] args) {
		
		Utilities objUtilities  =new Utilities ();
		
		objUtilities.initialiseWebEnvironment("http://www.facebook.com");
		objUtilities.clickonCreateNewAccount();
		objUtilities.getRandomFirstName();
		objUtilities.getRandomSurName();
		objUtilities.getRandomEmail();
		objUtilities.getRandomBirthDate();
		objUtilities.getRandomBirthMonth();
		objUtilities.getRandomBirthYear();
		objUtilities.doSignUp("1123","female");
		objUtilities.clickOnSignUpButton();
		objUtilities.verifyLoginButtonisDisplayed();
		objUtilities.closeBrowser();
		
	}
}

