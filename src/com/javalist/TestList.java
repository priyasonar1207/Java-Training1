package com.javalist;

public class TestList {

	public static void main(String[] args) {
		
		Javalist objJavalist = new Javalist();
		
		objJavalist.toAddListElements();
		System.out.println("=============================================================");
		
		objJavalist.toIterateListElements();
		System.out.println("=============================================================");

		objJavalist.toAccessListElements();
		System.out.println("=============================================================");

		objJavalist.toChangeListElements();
		System.out.println("=============================================================");

		objJavalist.toSortListElements();
		System.out.println("=============================================================");

		objJavalist.toRemoveListElements();
		System.out.println("=============================================================");

		objJavalist.toCheckListisEmpty();
		
		objJavalist.toDisplayLastindexofList();
		
		objJavalist.toDisplaySizeofList();
		
	}

}
