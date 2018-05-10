package PlayingCards;

public enum CardRank {
	
	TWO("2", 2, 2), THREE("3", 3, 3), FOUR("4", 4, 4), FIVE("5", 5, 5),
	SIX("6", 6, 6), SEVEN("7", 7, 7), EIGHT("8", 8, 8), NINE("9", 9, 9), TEN("10", 10, 10),
	JACK("J", 11, 11), QUEEN("Q", 12, 12), KING("K", 13, 13), ACE("A", 14, 1), JOKER("R", 15, 14);
	
	private String id;
	private int rank;
	private int alt_rank;

	CardRank(String id, int rank, int alt_rank) {
		this.id = id;
		this.rank = rank;
		this.alt_rank = alt_rank;
	}
	
	public String toString() {
		return id;
	}
	
}
