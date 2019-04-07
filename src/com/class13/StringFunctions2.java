package com.class13;

public class StringFunctions2 {

	public static void main(String[] args) {
		String str="Java is a very easy language";
		String noSpace=str.replace (" ","");
		System.out.println(noSpace);
		
String str1="They have $20000 & #1 yacht";
String newStr=str1.replaceAll("[^A-Za-z]", "");
System.out.println(newStr.length());
	
//how to find out how many sentences are in the string
String a="Is it Satuday! Is it raining! Do we have Java class today?";


}
}

	


