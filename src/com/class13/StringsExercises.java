package com.class13;

public class StringsExercises {

	public static void main(String[] args) {
		// create string, print in reverse (Sunday--> yadnuS)
		String str="Sunday";
		String reverse=" ";
		for (int i=str.length()-1; i>=0; i--) {
			reverse= reverse+str.charAt(i);
		}
		System.out.println(reverse);

	}

}
