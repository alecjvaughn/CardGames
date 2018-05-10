package PlayingCards;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Deck of 54 playing cards
 * 52 normal cards + 2 jokers
 * extend to modify for any card game;
 * @author ry5923un
 *
 */
@SuppressWarnings("serial")
public class Deck extends LinkedList<Card> implements List<Card>, Queue<Card>{
	
	public Deck() {
		
		//Add Spades
		add(new Card(CardRank.TWO, CardSuit.SPADE));
		add(new Card(CardRank.THREE, CardSuit.SPADE));
		add(new Card(CardRank.FOUR, CardSuit.SPADE));
		add(new Card(CardRank.FIVE, CardSuit.SPADE));
		add(new Card(CardRank.SIX, CardSuit.SPADE));
		add(new Card(CardRank.SEVEN, CardSuit.SPADE));
		add(new Card(CardRank.EIGHT, CardSuit.SPADE));
		add(new Card(CardRank.NINE, CardSuit.SPADE));
		add(new Card(CardRank.TEN, CardSuit.SPADE));
		add(new Card(CardRank.JACK, CardSuit.SPADE));
		add(new Card(CardRank.QUEEN, CardSuit.SPADE));
		add(new Card(CardRank.KING, CardSuit.SPADE));
		add(new Card(CardRank.ACE, CardSuit.SPADE));
		
		//Add Clubs
		add(new Card(CardRank.TWO, CardSuit.CLUB));
		add(new Card(CardRank.THREE, CardSuit.CLUB));
		add(new Card(CardRank.FOUR, CardSuit.CLUB));
		add(new Card(CardRank.FIVE, CardSuit.CLUB));
		add(new Card(CardRank.SIX, CardSuit.CLUB));
		add(new Card(CardRank.SEVEN, CardSuit.CLUB));
		add(new Card(CardRank.EIGHT, CardSuit.CLUB));
		add(new Card(CardRank.NINE, CardSuit.CLUB));
		add(new Card(CardRank.TEN, CardSuit.CLUB));
		add(new Card(CardRank.JACK, CardSuit.CLUB));
		add(new Card(CardRank.QUEEN, CardSuit.CLUB));
		add(new Card(CardRank.KING, CardSuit.CLUB));
		add(new Card(CardRank.ACE, CardSuit.CLUB));
		
		//Add Diamonds
		add(new Card(CardRank.TWO, CardSuit.DIAMOND));
		add(new Card(CardRank.THREE, CardSuit.DIAMOND));
		add(new Card(CardRank.FOUR, CardSuit.DIAMOND));
		add(new Card(CardRank.FIVE, CardSuit.DIAMOND));
		add(new Card(CardRank.SIX, CardSuit.DIAMOND));
		add(new Card(CardRank.SEVEN, CardSuit.DIAMOND));
		add(new Card(CardRank.EIGHT, CardSuit.DIAMOND));
		add(new Card(CardRank.NINE, CardSuit.DIAMOND));
		add(new Card(CardRank.TEN, CardSuit.DIAMOND));
		add(new Card(CardRank.JACK, CardSuit.DIAMOND));
		add(new Card(CardRank.QUEEN, CardSuit.DIAMOND));
		add(new Card(CardRank.KING, CardSuit.DIAMOND));
		add(new Card(CardRank.ACE, CardSuit.DIAMOND));
		
		//Add Hearts
		add(new Card(CardRank.TWO, CardSuit.HEART));
		add(new Card(CardRank.THREE, CardSuit.HEART));
		add(new Card(CardRank.FOUR, CardSuit.HEART));
		add(new Card(CardRank.FIVE, CardSuit.HEART));
		add(new Card(CardRank.SIX, CardSuit.HEART));
		add(new Card(CardRank.SEVEN, CardSuit.HEART));
		add(new Card(CardRank.EIGHT, CardSuit.HEART));
		add(new Card(CardRank.NINE, CardSuit.HEART));
		add(new Card(CardRank.TEN, CardSuit.HEART));
		add(new Card(CardRank.JACK, CardSuit.HEART));
		add(new Card(CardRank.QUEEN, CardSuit.HEART));
		add(new Card(CardRank.KING, CardSuit.HEART));
		add(new Card(CardRank.ACE, CardSuit.HEART));
		
		//Add Jokers
		add(new Card(CardRank.JOKER, CardSuit.HEART)); //colored joker
		add(new Card(CardRank.JOKER, CardSuit.SPADE)); //black-and-white joker
		
	}
	
	public void shuffle() {
		Collections.shuffle(this);
	}
	
}
