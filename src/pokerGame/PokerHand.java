package pokerGame;

import playingCards.Card;
import playingCards.Rank;
import playingCards.Suit;

/**
 * A class to encapsulate a hand of cards for a 2-card poker game
 *
 * @author RIT CS
 * @author YOUR NAME HERE
 */
public class PokerHand implements Comparable< PokerHand > {

    // TODO Add state as needed.

    /**
     * Initialize a poker hand.
     * @rit.post The hand has no cards
     */
    public PokerHand() {
        // TODO
    }

    /**
     * Add a card to the hand.
     * This method must be called exactly twice because a hand size is 2.
     *
     * @param card the card to add to hand
     * @rit.post cards are in sorted order
     */
    public void addCard( Card card ) {
        // TODO
    }

    /**
     * What kind of hand is this?
     *
     * @return one of the {@link HandType} designations
     * @rit.pre addCard has been called twice
     */
    HandType getType() {
        return HandType.REGULAR; // TODO
    }

    /**
     * Show this hand's contents.
     *
     * @return a string containing all the cards in the hand
     */
    public String toString() {
        return "NYI"; // TODO
    }

    /**
     * Does this hand beat another hand?<br>
     * Rules
     * <ul>
     *     <li>
     *         Pair beats flush, which beats two arbitrary cards.
     *     </li>
     *     <li>
     *         Otherwise compare higher card ranks.
     *     </li>
     *     <li>
     *         If higher card ranks are the same, compare lower card ranks.
     *     </li>
     *     <li>
     *         If both card ranks are the same, return 0 -- hands are identical.
     *     </li>
     * </ul>
     */
    @Override
    public int compareTo( PokerHand other ) {
        return 0; // TODO
    }

}
