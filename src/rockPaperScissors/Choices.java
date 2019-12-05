package rockPaperScissors;

import java.util.Scanner;

public class Choices {
	static String userChoice;

	public static String UserPicks() {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Pick rock, paper or scissors:");
		userChoice = userInput.nextLine().toLowerCase();
		
		if (userChoice.equals("rock")){
			return "rock";
		}
		else if (userChoice.contentEquals("paper")){
			return "paper";
		}
		else if (userChoice.contentEquals("scissors")) {
			return "scissors";
		}
		else {
			return "Invalid input";
		}
	}
}
