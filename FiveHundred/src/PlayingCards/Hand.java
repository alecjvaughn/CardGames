package PlayingCards;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class Hand extends LinkedList<Card> {
	
	public Hand() {
		super();
	}
	
	public String look() {
		String str = "";
		for(Card c : this) {
			str += c + " ";
		}
		return str.trim();
	}
	
	public String lookSuit(CardSuit suit) {
		String str = "";
		for(Card c : this) {
			if(c.getSuit().equals(suit)) {
				str += c + " ";
			}
		}
		return str;
	}
	
	public Card playCard(String id) {
		for(Card c : this) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	
	
}
