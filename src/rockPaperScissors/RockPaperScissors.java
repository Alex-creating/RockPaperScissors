package rockPaperScissors;

import java.util.Random;

public enum RockPaperScissors {
	ROCK, PAPER, SCISSORS;

	
	
	
	static RockPaperScissors computerChoice() {
		Random random = new Random();
		RockPaperScissors computerInput;
		return computerInput = values()[random.nextInt(values().length)];
		
	}
}
