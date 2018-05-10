package FiveHundred;
import PlayingCards.Card;
import PlayingCards.CardRank;
import PlayingCards.CardSuit;
import PlayingCards.Deck;

/**
 * Deck of 43 out of 52 playing cards, a Joker is included, the 2's, 3's, and black 4's are removed
 * @author ry5923un
 *
 */
@SuppressWarnings("serial")
public class FH_Deck extends Deck {
	
	public FH_Deck() {
		super();
		//remove 1 joker
		remove(new Card(CardRank.JOKER, CardSuit.HEART));
		//remove 2s
		remove(new Card(CardRank.TWO, CardSuit.SPADE));
		remove(new Card(CardRank.TWO, CardSuit.CLUB));
		remove(new Card(CardRank.TWO, CardSuit.DIAMOND));
		remove(new Card(CardRank.TWO, CardSuit.HEART));
		//remove 3s
		remove(new Card(CardRank.THREE, CardSuit.SPADE));
		remove(new Card(CardRank.THREE, CardSuit.CLUB));
		remove(new Card(CardRank.THREE, CardSuit.DIAMOND));
		remove(new Card(CardRank.THREE, CardSuit.HEART));
		//remove black 4s
		remove(new Card(CardRank.FOUR, CardSuit.SPADE));
		remove(new Card(CardRank.FOUR, CardSuit.CLUB));
	}
}
