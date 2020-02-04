package pokerGame;

import playingCards.Card;

/**
 * An abstract Player for 2-card poker.
 *
 * @author RIT CS
 * @author YOUR NAME HERE
 */

public abstract class Player implements Comparable< Player > {

    // TODO Add state as needed.

    /**
     * Initialize a player for 2-card poker.
     */
    public Player() {
        // TODO
    }

    /**
     * Ask the player if they want to stand..
     *
     * @return a boolean value specifying if the human wants to stand
     */
    public abstract boolean stand();

    /**
     * Retrun the number of wins for this player.
     *
     * @return the number of wins
     */
    public int getWins() {
        return 0; // TODO
    }

    /**
     * Increment the number of wins for this player.
     */
    public void incrWins() {
        // TODO
    }

    /**
     * Add a card to the player's hand.
     *
     * @param c the card to add
     */
    public void addCard( Card c ) {
        // TODO
    }

    /**
     * Print the hand in some "nice" format.
     */
    public void printHand() {
        // TODO
    }

    /**
     * Clear out all the player's cards.
     */
    public void newHand() {
        // TODO
    }

    /**
     * Get string representation of Player.
     * @return the part of the string representation common to all players:
     *         the player number
     */
    @Override
    public String toString() {
        return "NYI"; // TODO
    }

    /**
     * Compare this player's hand with the specified player's hand for order.
     * Returns <table BORDER="1">
     *     <caption>compareTo standard semantics</caption>
     * <tr><td>negative integer</td><td>player hand &lt; computers hand</td>
     * <tr><td>zero</td><td>player hand == computers hand</td>
     * <tr><td>positive integer</td><td>player hand &gt; computers hand</td>
     * </table>
     *
     * @return a negative integer, zero, or a positive integer as this
     *         player is less than, equal to, or greater than the other
     */
    @Override
    public int compareTo( Player other ) {
        return 0; // TODO
    }
}
