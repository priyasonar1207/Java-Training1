package com.modularapproach;

public class VerifyFunctions extends FacebookPageObjectClass {
		
	
		
		public void verifySignupwithMobilenumber(String strFirstName,String strLastName,
				String strlongMobileNo,int intBirthdate,int intBirthmonth,int intBirthYear,
				String strPassword,String strGender) 
		{
			this.setstrFirstName(strFirstName);
			this.setstrLastName(strLastName);
			this.setstrMobileNumber(strlongMobileNo);
			this.setIntbirthdate(intBirthdate);
			this.setIntbirthmonth(intBirthmonth);
			this.setIntbirthyear(intBirthYear);
			this.setstrPassword(strPassword);
			this.clickonGender(strGender);
				}
		
		public void verifySignupwithEmailId(String strFirstName,String strLastName,
				String strEmailAddress,int intBirthdate,int intBirthmonth,int intBirthYear,
				String strPassword,String strGender) 
		{
			this.setstrFirstName(strFirstName);
			this.setstrLastName(strLastName);
			this.setstrEmailAddress(strEmailAddress);
			this.setIntbirthdate(intBirthdate);
			this.setIntbirthmonth(intBirthmonth);
			this.setIntbirthyear(intBirthYear);
			this.setstrPassword(strPassword);
			this.clickonGender(strGender);
				}
		
		
}
	


//BaseTest objBaseTest=new BaseTest();