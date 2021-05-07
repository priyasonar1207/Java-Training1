package com.hastableexample;


public class TestFacebook  {


		public static void main(String[] args) {
			
			FacebookPageObjectClass objFacebookPageObjectClass = new FacebookPageObjectClass();
			BaseTest objBaseTest = new BaseTest();
		
			
			objBaseTest.initialiseWebEnvironment("Chrome");
			objBaseTest.openFacebookUrl("http://www.facebook.com");
			
			
			objFacebookPageObjectClass.doSignUp(objBaseTest.printobjHashtable().get("Firstname"),
					objBaseTest.printobjHashtable().get("Lastname"),
					objBaseTest.printobjHashtable().get("Mobilenumber"),
					objBaseTest.printobjHashtable().get("EmailId"),
					objBaseTest.printobjHashtable().get("Birthdate"),
					objBaseTest.printobjHashtable().get("Birthmonth"),
					objBaseTest.printobjHashtable().get("Birthyear"),"12345","female");
					
			
			objBaseTest.closeBrowser();
			
			
		}
			
			}
		
	
