package com.class13;

public class PutCharInside {

	public static void main(String[] args) {
		// create s string, check if not empty, if odd number, if > 3 characters print char in middle
String str="Saturday!";
if (!str.isEmpty()) {

if (str.length()%2!=0 && str.length()>=3){
System.out.println(str.charAt(str.length()/2));
	}
}
	}
}

