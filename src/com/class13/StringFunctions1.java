package com.class13;

public class StringFunctions1 {

	public static void main(String[] args) {
	String original="Today is Java Class";
	String reverse="";
	for (int i=original.length(); i>0; i--) {
reverse=reverse+original.substring(i-1,i);
System.out.println(reverse);
	}
	System.out.println();
	System.out.println(reverse);
	}
}
