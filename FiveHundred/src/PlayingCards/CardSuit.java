package PlayingCards;


public enum CardSuit {
	
	SPADE("S", 0), CLUB("C", 1), 
	DIAMOND("D", 2), HEART("H", 3), 
	NONE("N", 4); //None is reserved for trump suits 
	
	private String id;
	private int rank;

	CardSuit(String id, int rank) {
		this.id = id;
		this.rank = rank;
	}
	
	public String toString() {
		return id;
	}
}
