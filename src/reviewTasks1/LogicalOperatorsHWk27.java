package reviewTasks1;

import java.util.Scanner;

public class LogicalOperatorsHWk27 {

	public static void main(String[] args) {
		/*Create a program that prompt user with question:  Do you need a loan?
		If the result is true then prompt user with question: What is your credit 
		score? Otherwise eligibility = "Unknown"
		Based on the score define users eligibility 
		if score is below  600 --> eligibility = "Not eligible"
		if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
		if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
		if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

		The output of the program should be: "The eligibility is ____" */
		boolean needLoan;
		int score;
		String eligibility;
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you need loan--true or false?");
		needLoan=sc.nextBoolean();
		System.out.println("Please enter your score");
		score=sc.nextInt();
		
		if(score<600) {
			eligibility="Not eligible";
		}else if (score>=600 && score<=700) {
			eligibility="Maybe eligible";
		}else if(score>=701 && score<=800) {
			eligibility="Eligible";
		}else {
			eligibility="Definitely eligible";
		}
	
System.out.println(eligibility);

	}

}
