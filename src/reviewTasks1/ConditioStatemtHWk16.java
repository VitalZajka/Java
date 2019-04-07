package reviewTasks1;

import java.util.Scanner;

public class ConditioStatemtHWk16 {

	public static void main(String[] args) {
		/*The variable "num" holds an integer user input
 		Write a conditional statement starting on line 9 that does the following:
        If num is positive, print "__ is positive"
        If num is negative, print "__ is negative" */
		
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		if (num>0) {
			System.out.println(num+ " is positive");
		}else if(num<0) {
			System.out.println(num+ " in negative");
		}else {
			System.out.println(num+ " is zero");
		}

	}

}
