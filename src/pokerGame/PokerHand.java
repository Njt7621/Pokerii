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
    private Card card1;
    private Card card2;
    private Card[] pokerHand;
    private HandType type;
    /**
     * Initialize a poker hand.
     * @rit.post The hand has no cards
     */
    public PokerHand() {
        this.card1 = card1;
        this.card2 = card2;
        this.pokerHand = pokerHand;
        this. type = type;
    }

    /**
     * Add a card to the hand.
     * This method must be called exactly twice because a hand size is 2.
     *
     * @param card the card to add to hand
     * @rit.post cards are in sorted order
     */
    public void addCard( Card card ) {
        if (pokerHand[0] == null) {
            pokerHand[0] = card;
    }else if (pokerHand[1] == null) {
        pokerHand[1] = card;

        if(pokerHand[0].getRank() == pokerHand[1].getRank()){
            type = HandType.TWO_OF_KIND;
        }
        else if (pokerHand[0].getSuit() == pokerHand[1].getSuit()){
            type = HandType.FLUSH;
        }
        else:
            type = HandType.REGULAR;
    }
}
    /**
     * What kind of hand is this?
     *
     * @return one of the {@link HandType} designations
     * @rit.pre addCard has been called twice
     */
    public HandType getType() {


        return HandType.REGULAR; // TODO
    }

    /**
     * Show this hand's contents.
     *
     * @return a string containing all the cards in the hand
     */
    public String toString() {
       return pokerHand[0].toString()+ " " + pokerHand[1].toString();
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
        if (handType == )
        return 0; // TODO
    }

    /**
     * Runs a set of tests on PokerHand class
     *
     * @return a string containing all the cards in the hand
     */
    public static void main(String[] args) {
        if
    }
}