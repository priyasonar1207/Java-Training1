package com.modularapproach;

public class FacebookPageObjectClass   {


//display first name 
public void setstrFirstName(String strFirstName) {
System.out.println("First Name is :" +strFirstName);
}


//display surname
public void setstrLastName(String strLastName) {
System.out.println("Last Name is:"+strLastName);
}


//display Mobile number
public void setstrMobileNumber(String strlongMobileNo) {
System.out.println("Mob no is:"+strlongMobileNo);
}


//display email address
public void setstrEmailAddress(String strEmailAddress) {
System.out.println("Email Address is:"+strEmailAddress);
}

public void setIntbirthdate(int intBirthdate) {
System.out.println("Birth date is :" +intBirthdate);
}

public void setIntbirthmonth(int intBirthmonth) {
System.out.println("Birth month is :" +intBirthmonth);
}

public void setIntbirthyear(int intBirthYear) {
System.out.println("Birth year is :" +intBirthYear);
}

//display password
public void setstrPassword(String strPassword) {
	System.out.println("Password is:"+strPassword);
}


//select gender
public void clickonGender(String strGender) {
	
    String strfemale="female";
	String strmale="male";
	
	if(strGender==strfemale) {System.out.println("Gender: Female User");}
	else if(strGender==strmale) {System.out.println("Gender:Male User");}
	else{System.out.println("Gender:Custom User");}
}


//do sign up
public void createNewAccount(String strFirstName,String strLastName,
		String strEmailAddress,String strlongMobileNo,
		int intBirthdate,int intBirthmonth,int intBirthYear,
		String strPassword,String strGender) {
	
	
	this.setstrFirstName(strFirstName);
	this.setstrLastName(strLastName);
	this.setstrMobileNumber(strlongMobileNo);
	this.setstrEmailAddress(strEmailAddress);
	this.setIntbirthdate(intBirthdate);
	this.setIntbirthmonth(intBirthmonth);
	this.setIntbirthyear(intBirthYear);
	this.setstrPassword(strPassword);
	this.clickonGender(strGender);

	
	}
}






















