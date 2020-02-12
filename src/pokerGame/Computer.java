package pokerGame;

import playingCards.Card;
import playingCards.Rank;
import playingCards.Suit;

import java.util.Scanner;

/**
 * A computer player for 2-card poker
 *
 * @author njt7621@rit.edu
 * @author Nikkia Theodule
 */
public class Computer extends Player {

    /**
     * Define the hand that the Computer player must beat in order
     * for it to decide to stand.
     */
    private static final PokerHand MIDLAND_HAND;

    static {
        MIDLAND_HAND = new PokerHand();
        MIDLAND_HAND.addCard( new Card( Rank.QUEEN, Suit.HEARTS ) );
        MIDLAND_HAND.addCard( new Card( Rank.JACK, Suit.CLUBS ) );
    }

    /**
     * Initialize a computer player for 2-card poker
     */
    public Computer() {
    }

    /**
     * Determine if the computer should stand instead of fold.
     * The computer should stand if it has 50% or better chance of winning
     * We will approximate this by saying that the computer player will
     * stand if it has a flush or pair, or otherwise if it beats a hand
     * containing a Queen of Hearts and a Jack of Clubs.
     *
     * @return true iff the computer wants to stand
     */
    public boolean stand() {
        if (this.pokerhand.getType()== HandType.FLUSH || this.pokerhand.getType()== HandType.TWO_OF_KIND) {
            return true;
        }
            return false;
    }

    /**
     * Get a string representing this computerized player
     * @return all the information in {Player#toString()}, plus "Computer"
     */
    @Override
    public String toString() {
        return super.toString() + "Computer";
    }
}
