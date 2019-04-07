package com.class17;

public class PalindromeCheck {

	public static void main(String[] args) {
		PalindromeCheck str=new PalindromeCheck();
		str.palindrome("Anna");
		str.palindrome("Bob");
		str.palindrome("Asel");

	}void palindrome(String str){
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
		 rev+=str.charAt(i);
	}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		
	}}