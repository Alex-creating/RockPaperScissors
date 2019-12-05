package rockPaperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ComputerChoice{

	public enum RockPaperScissors {
		ROCK, PAPER, SCISSORS;

	}
	
public static RockPaperScissors computerInput() {

	List <RockPaperScissors> RPS = new ArrayList <>();
	RPS.add(RockPaperScissors.ROCK);
	RPS.add(RockPaperScissors.PAPER);
	RPS.add(RockPaperScissors.SCISSORS);

	if (RockPaperScissors.values()[new Random().nextInt(RockPaperScissors.values().length)].equals(RPS.PAPER)) {
		
	}
	return RockPaperScissors.values()[new Random().nextInt(RockPaperScissors.values().length)];
	

}
}