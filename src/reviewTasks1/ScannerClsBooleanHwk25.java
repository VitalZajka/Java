package reviewTasks1;

import java.util.Scanner;

public class ScannerClsBooleanHwk25 {

	public static void main(String[] args) {
		// enter info to get a boolean response, print with"The value veritas is TRUE or FALSE
		int a,b;
		
		boolean c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter value a");
		a=sc.nextInt();
		System.out.println("Please enter value b");
		b=sc.nextInt();
		if(a>b) {
			c=true;
			System.out.println(c);
		}else {
			c=false;
			System.out.println(c);
			
		}
		
		

		
	}

}
