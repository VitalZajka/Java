package reviewTasks1;

import java.util.Scanner;

public class ConditioStatemtHWk14 {

	public static void main(String[] args) {
		/*  Input variable in console using 121.
			Find out if a number is Even or ODD
			Please display "Even" if number is even
			and "Odd" if the number is an odd number */
	
		int var;  	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		var=sc.nextInt();
		
	if (var%2==0) {
		System.out.println("The number is Even");
	}else {
		System.out.println("The number is ODD");
	}
		
		
	}

}
