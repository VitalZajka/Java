package reviewTasks1;

import java.util.Scanner;

public class SwitchStatementHWk31 {

	public static void main(String[] args) {
		//switch method--regions and games
		String region, game;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the region");
		region=sc.nextLine();
		
	switch (region) {
		case "New England":
		game="Hockey";
		break;
		case "Tristate Area":
		game="Baseball";
		break;
		case "MidWest":
		game="Fooball";
		break;
		case "South":
		game="Basketball";
		break;
		case "West Coast":
		game="Pokemon";
		break;
		default:
		game="Bridge";
		break;
	}
	System.out.println(game);
		
	}

}
