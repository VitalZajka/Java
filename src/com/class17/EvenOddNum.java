package com.class17;

import java.util.Scanner;

public class EvenOddNum {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	}
	void printNumber() {
		Integer num = null;
		if (num%2==0) {
			System.out.println("The number is even");
		}else {
			System.out.println("The nymber is odd");
		}
	}

}
