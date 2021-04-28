package com.javastrings;

public class StringMethods {


		public static void main(String[] args) {
			
			String strFirstname="Priyanka";
			String strSecondname="Sonar";
			String strThirdname="Sonar";
			String strFourthname="";
			
			System.out.println(strFirstname+" "+strSecondname);
			
			System.out.println(strFirstname.concat(strSecondname));
			
			System.out.println(strFirstname.length());
			
			System.out.println(strFirstname.substring(4));
			System.out.println(strFirstname.substring(4,7));
			
			System.out.println(strFirstname.charAt(4));
			
			System.out.println(strFirstname.indexOf('k'));
			
			System.out.println(strFirstname.toLowerCase());
			
			System.out.println(strSecondname.toUpperCase());
			
			System.out.println(strFirstname.compareTo(strThirdname));
			System.out.println(strFirstname.compareTo(strFourthname));
			
			System.out.println(strFourthname.isEmpty());

			System.out.println(strFirstname.replace('y','b'));
		}

	}
