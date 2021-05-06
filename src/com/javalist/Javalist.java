package com.javalist;

import java.util.*;

public class Javalist {

	//creating a list
	List<String> nameList=new ArrayList<String>();
	
	
	//Adding elements in the list
	public void toAddListElements(){
	nameList.add("Priya");
	nameList.add("Sakshi");
	nameList.add("Nikita");
	nameList.add("Nishant");
	nameList.add("Shivani");
	nameList.add("Nikita");
	nameList.add(4,"Mayur");
    System.out.println(nameList);
	}
	
	
	//Iterating the List element using for loop  
	public void toIterateListElements() {
	 for(String NameList:nameList)  
	  System.out.println(NameList);  
	}
	
	
	//accessing list elements
	public void toAccessListElements() {
		System.out.println("Return element: "+nameList.get(2));
		}
	
	
	//change element
	public void toChangeListElements() {
		nameList.set(1, "Ankita");  
			  System.out.println(nameList);  
		}
	
	
	//Sorting the list  
	public void toSortListElements() {
	  Collections.sort(nameList);  
	    System.out.println(nameList);
	  }  
	
	
	//removing elements
	public void toRemoveListElements() {
		nameList.remove("Shivani");
		 System.out.println(nameList);
	}
	
	//check list is empty or not
	public void toCheckListisEmpty() {
	System.out.println(nameList.isEmpty());	
	}

	
	//checking last index of list
	public void toDisplayLastindexofList() {
		System.out.println(nameList.lastIndexOf("Nikita"));	
		
	}
	
	//size of list
	public void toDisplaySizeofList() {
		System.out.println(nameList.size());	
	
		}
	
	}
	
	
	


