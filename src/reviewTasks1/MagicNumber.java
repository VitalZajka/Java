package reviewTasks1;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		//Home Assignment 10--"Magic Number"
			 int myNumber;
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("PLease enter your int number but not zero, see what happens!");
			 myNumber=sc.nextInt();
			 
			 int stepOne=myNumber*myNumber;
			 int stepTwo=stepOne+myNumber;
			 int stepThree=stepTwo/myNumber;
			 int stepFour=stepThree+17;
			 int stepFive=stepFour-myNumber;
			 int stepSix=stepFive/6;
			 
			 System.out.println("The magic number is "+stepSix+" !");
			 }
			}   