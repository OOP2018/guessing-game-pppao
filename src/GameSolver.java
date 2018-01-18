
/** A solution of number that will play automatically*/
public class GameSolver {
	/** Return a solution of NumberGame
	 * Provide message "Too large" or "Too small" and times \
	 * 
	 * 
	 * @param game is the NumberGame
	 * @return number correct*/
	public int play(NumberGame game) {
		boolean correct = false ; 
		int guess = 0 ;
		int min = 1 ;
		int max = game.getUpperBound() ;
		do {
		System.out.print("Your answer? ");
		guess = min+((max-min)/2); 
		correct = game.guess(guess);
		System.out.println(guess);
		if(game.getMessage().equals("The number is too small")) {
			min = guess+1 ; 
		}else if(game.getMessage().equals("The number is too large")) {
			max = guess-1 ;
		}

		System.out.println( game.getMessage() );
		}while(!correct);
		return guess ;
	}
}
