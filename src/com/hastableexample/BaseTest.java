package com.hastableexample;
import java.util.Hashtable;

public class BaseTest extends Utilities {

	Hashtable <String,String> objHashtable;
	//Utilities objUtilities =new Utilities();
	
	public BaseTest() {
	objHashtable= new Hashtable <>();
	}
	
	public Hashtable<String,String>  printobjHashtable() {
		
		objHashtable.put("Firstname",super.getRandomString(8));
        //objHashtable.put("Firstname",objUtilities.getRandomString(8));	
		objHashtable.put("Lastname",super.getRandomString(10));
		objHashtable.put("EmailId",super.getRandomEmailId());
		objHashtable.put("Mobilenumber",super.getMobileNumber());
	    objHashtable.put("Birthdate",String.valueOf(super.getRandomNumber(1,31)));
		objHashtable.put("Birthmonth",String.valueOf(super.getRandomNumber(1,12)));
		objHashtable.put("Birthyear",String.valueOf(super.getRandomNumber(1990,2020)));
	
		 return objHashtable;
	
	}
	
	//public void displayname() {
	//System.out.println("Firstname=="+this.getRandomString(9));}
	
//initialise web Browser
public void initialiseWebEnvironment(String strBrowser) {
 	System.out.println(strBrowser+"browser is initialised");	
}

//Facebook  page
public void openFacebookUrl(String strUrl) {
	System.out.println("Facebook is opened: "+strUrl);
}

//close Browser
public void closeBrowser() {
System.out.println("Browser is closed");	
}



}
