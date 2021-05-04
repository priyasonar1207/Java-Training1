package com.modularapproach;

public class PageObjectClass extends BaseTestClass {

public void clickonCreateNewAccount() {
		
	System.out.println("PageObjectClass clickonCreateNewAccount Method");
		System.out.println("Create a new account for new user");
	}
	
/*public void setFirstName(String strFirstName) {
		
		System.out.println("First name is:"+strFirstName);
	}

public void setSurName(String strSurName) {
	
	System.out.println("Surname is:"+strSurName);
}

public void setEmailAddress(String strEmailAddress) {
	
	System.out.println("Email Address is:"+strEmailAddress);
}
*/

public void setPassword(String strPassword) {
	
	System.out.println("PageObjectClass setPassword Method");
	System.out.println("Password is:"+strPassword);
}

/*public void setBirthDate(int intDate) {
	
	System.out.println("User birth date is:"+intDate);
}

public void setBirthMonth(String strBirthMonth) {
	
	System.out.println("User birth month is:"+strBirthMonth);
}

public void setBirthYear(int intBirthYear) {
	
	System.out.println("User birth month is:"+intBirthYear);
}
*/
public void clickonGender(String strGender) {
	
	String strfemale="female";
	String strmale="male";
	
	System.out.println("PageObjectClass clickonGender Method");
	
	if(strGender==strfemale) {System.out.println("Gender: Female User");}
	else if(strGender==strmale) {System.out.println("Gender:Male User");}
	else{System.out.println("Gender:Custom User");}
}

public void clickOnSignUpButton() {
	
	System.out.println("PageObjectClass clickOnSignUpButton Method");
	System.out.println("User has successfully signed up");
}

public void verifyLoginButtonisDisplayed() {
	
	System.out.println("PageObjectClass verifyLoginButtonisDisplayed Method");
	System.out.println("Login page is available");
}


public void doSignUp(String strPassword,String strGender) {
	
	this.setPassword(strPassword);
	
	this.clickonGender(strGender);
	}

}
