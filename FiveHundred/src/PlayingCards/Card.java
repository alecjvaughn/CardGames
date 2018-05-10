package PlayingCards;

public class Card {
	
	private CardRank rank;
	private CardSuit suit;
	private String id;
	
	public Card(CardRank rank, CardSuit suit) {
		super();
		this.rank = rank;
		this.suit = suit;
		id = "" + rank + suit;
	}

	public CardRank getRank() {
		return rank;
	}

	public void setRank(CardRank rank) {
		this.rank = rank;
	}

	public CardSuit getSuit() {
		return suit;
	}

	public void setSuit(CardSuit suit) {
		this.suit = suit;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String toString() {
		return id;
	}
	
}
