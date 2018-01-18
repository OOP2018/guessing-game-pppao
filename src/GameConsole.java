import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/** play the game by input the number you guess
	 * It will show larger or smaller
	 * Game finish if number correct 
	 * 
	 * @param NumberGame
	 * @return The number correct */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		boolean correct = false ; 
		int guess ;

		System.out.println( game.toString() );

		System.out.println( game.getMessage() );
		
		do {
		System.out.print("Your answer? ");
		guess = console.nextInt();
		correct = game.guess(guess);
		System.out.println( game.getMessage() );
		}while(!correct);
		
		return guess ;
		
	}
	
}
