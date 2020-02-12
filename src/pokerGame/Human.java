package pokerGame;

import java.util.Scanner;

/**
 * A human player for 2-card poker.
 * It depends on user input to decide whether to stand or fold.
 *
 * @author njt7621@rit.edu
 * @author Nikkia Theodule
 */
public class Human extends Player {
	private PokerHand userCards;
	private static Scanner in;

    /**
     * Initialize a human player for 2-card poker
	 * @param in the Scanner object to be used to prompt user for stand/fold
     */
    public Human( Scanner in ) {
		userCards = new PokerHand();
		this.in = in;
    }

    /**
     * Ask the player if they want to stand.
     * The player is prompted with a suitable message, and then
     * the players response from the Scanner is converted to
     * true (stand) or false (fold).
     *
     * @return true iff the human wants to stand
     */
    public boolean stand() {
		boolean isStand = true;
		String answer;
		Scanner in= new Scanner(System.in);

		do{
			System.out.print("Do you want to stand (y) or fold (n)? ");
			answer = in.nextLine();
		}
		while (answer.equalsIgnoreCase("y"));
		isStand = !answer.equalsIgnoreCase("n");
		return isStand;
    }

	/**
	 * Get a string representing this human player
	 * @return all the information in {@link Player#toString()}, plus "Human"
	 */
	@Override
	public String toString() {
		return super.toString() + "Human";
	}
}
