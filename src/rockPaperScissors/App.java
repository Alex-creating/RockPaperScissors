package rockPaperScissors;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] Args) {

		List<RockPaperScissors> RPS = new ArrayList<>();
		RPS.add(RockPaperScissors.ROCK);
		RPS.add(RockPaperScissors.PAPER);
		RPS.add(RockPaperScissors.SCISSORS);

		int userRockCount = 0;
		int userPaperCount = 0;
		int userScissorsCount = 0;
		int computerRockCount = 0;
		int computerPaperCount = 0;
		int computerScissorCount = 0;
		int tieCount = 0;
		;
		int loseCount = 0;
		int winCount = 0;

		String userChoice = "Invalid input";
		while (userChoice.equals("Invalid input")) {
			userChoice = Choices.UserPicks();
			System.out.println("You picked: " + userChoice);
		}

		RockPaperScissors computerChoice = RockPaperScissors.computerChoice();

		switch (userChoice) {
		case "rock":
			if (computerChoice.equals(RockPaperScissors.ROCK)) {
				System.out.println("The computer picked rock");
				System.out.println("It's a tie");
				userRockCount++;
				computerRockCount++;
				tieCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.PAPER)) {
				System.out.println("The computer picked paper");
				System.out.println("Computer wins! :(");
				userRockCount++;
				computerPaperCount++;
				loseCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.SCISSORS)) {
				System.out.println("The computer picked scissors");
				System.out.println("You win! :)");
				userRockCount++;
				computerScissorCount++;
				winCount++;
				break;
			}

		case "paper":
			if (computerChoice.equals(RockPaperScissors.ROCK)) {
				System.out.println("The computer picked rock");
				System.out.println("You win! :)");
				userPaperCount++;
				computerRockCount++;
				winCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.PAPER)) {
				System.out.println("The computer picked paper");
				System.out.println("You tie!");
				userPaperCount++;
				computerPaperCount++;
				tieCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.SCISSORS)) {
				System.out.println("The computer picked scissors");
				System.out.println("You lose! :(");
				userPaperCount++;
				computerScissorCount++;
				loseCount++;
				break;
			}

		case "scissors":
			if (computerChoice.equals(RockPaperScissors.ROCK)) {
				System.out.println("The computer picked rock");
				System.out.println("You lose :(");
				userScissorsCount++;
				computerRockCount++;
				loseCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.PAPER)) {
				System.out.println("The computer picked paper");
				System.out.println("You win! :)");
				userScissorsCount++;
				computerPaperCount++;
				winCount++;
				break;
			}
			else if (computerChoice.equals(RockPaperScissors.SCISSORS)) {
				System.out.println("The computer picked scissors");
				System.out.println("You tie!");
				userScissorsCount++;
				computerScissorCount++;
				tieCount++;
				break;
			}

		}
		
		System.out.println();
		System.out.println("You won: " + winCount + " games");
		System.out.println("You tied: " + tieCount + " games");
		System.out.println("You lost: " + loseCount + " games");
		System.out.println("You picked rock: " + userRockCount + " times");
		System.out.println("You picked paper: " + userPaperCount + " times");
		System.out.println("You picked scissors: " + userScissorsCount + " times");
		System.out.println("You won: " + winCount + " games");

	}

}
