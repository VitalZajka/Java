package reviewTasks1;

import java.util.Scanner;

public class ChenTeacherHWk15 {

	public static void main(String[] args) {
		/*Input variable in console using 121.
		Find out if a number is Even or ODD
		Please display "Even" if number is even
		and "Odd" if the number is an odd number*/
		
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.print("In: ");
	name=sc.nextLine();
	if(name.equals("Chen")) { //.equals is "=" for Strings
		System.out.println("Teacher");
	}else {
		System.out.println("Student");
	}

	}

}
