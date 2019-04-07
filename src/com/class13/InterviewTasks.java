package com.class13;

public class InterviewTasks {

	public static void main(String[] args) {
		/*How to find out the part of the string from a string? 
		What is substring? 
		Find number of words in string?*/

		String str="tax is a substring of Syntax";
		if (str.contains("tax")) {
			System.out.println("tax is a substring of Syntax");
			System.out.println();}
			System.out.println("Substring is a part of a string");
		
		System.out.println();
		//each word is followed by space and the last one is not--> so space count+1
		int count=0;
if (str.contains(" ")) {
	count++;
}
System.out.println(count+1);
		
	}

}


