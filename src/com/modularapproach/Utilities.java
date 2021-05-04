package com.modularapproach;

import java.util.Random;

public class Utilities extends PageObjectClass{
	
public void getRandomFirstName() {

String[] strFirstName= {"Priya","Roshani","Aditi","Anjali","Shivani","Avni","Ankita","Sakshi",
			"Gauri","Poonam"};
		
Random r = new Random();
int RandomName= r.nextInt(strFirstName.length);
System.out.println("First name:"+strFirstName[RandomName]);

}

public void getRandomSurName() {
	
String[] strSurName= {"Sonar","Sharma","Dubey","Patil","Ahire","Vispute","Jadhav","Verma"};
	
Random r1 = new Random();
int RandomSurName= r1.nextInt(strSurName.length);
System.out.println("Sur name:"+strSurName[RandomSurName]);

}


public void getRandomEmail() {
	
String[] strEmail= {"priyasonar@gmail.com","Sharma@gmail.com","poojadubey123@gmail.com",
		"Patil434@gmail.com","yashikaVerma789@gmail.com"};
	
Random r5 = new Random();
int RandomEmail= r5.nextInt(strEmail.length);
System.out.println("User Emailid:"+strEmail[RandomEmail]);

}


public void getRandomBirthDate() {
		
	Random r2 = new Random();
		int RandomDate= r2.nextInt(32);
				System.out.println("User Birth date:"+RandomDate);
		
}


public void getRandomBirthMonth() {
	
	Random r3 = new Random();
		int RandomMonth= r3.nextInt(12);
				System.out.println("User Birth Month:"+RandomMonth);
		
}

public void getRandomBirthYear() {
	
	String[] strBirthYear= {"2000","2001","2002","2004","2005","2006","2007","2008",
			"2009","2010"};
		
Random r4 = new Random();
int RandomYear= r4.nextInt(strBirthYear.length);
System.out.println("User Birth year:"+strBirthYear[RandomYear]);

}


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
	
}}


