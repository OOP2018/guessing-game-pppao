import java.util.Random ; 
/**
 * This class is about how game work by extends class from NumberGame.java
 * 
 * @author Napat Thongpao
 * @version 01
 */
public class PaoGame extends NumberGame{
	/**UpperBound is max number*/
	private int upperBound ;
	/**A number that user guess*/
	private int secretNumber ; 
	/**how many time user guess*/
	private int count;
	
	/** Constructer initial secret number and upperbound
	 * 
	 * @param upperBound of number*/
	public PaoGame (int upperBound) {
		this.upperBound = upperBound ; 
		long seed = System.nanoTime(); 
		Random rand = new Random(seed);
		this.secretNumber = rand.nextInt(Math.max(upperBound,1));
		
	}
	/** Check that user guess number correct or larger or smaller
	 * 
	 * @param number that guess
	 * @return true if number is correct
	 * 			false if number are larger or smaller*/
	public boolean guess(int number) {
		if(number == secretNumber) {
			setMessage("Correct!");
			++count;
			return true ;
		}
		else if(number > secretNumber) {
			setMessage("The number is too large");
			count++ ;
		}
		else if(number < secretNumber) {
			setMessage("The number is too small");
			count++;
		}
		return false ;
	}
	
	/** get a number of count
	 * 
	 * @return integer show count*/
	public int getCount() {
		return count ;
	}
	/** get the upperbound
	 * 
	 * @return integer show upperbound*/
	public int getUpperBound() {
		return upperBound ;
	}
	/** show String 
	 * 
	 * @return string */
	public String toString() {
		return "GuessGame" ;
	}

}
