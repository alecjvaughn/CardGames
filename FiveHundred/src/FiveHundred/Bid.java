package FiveHundred;

import PlayingCards.CardSuit;

public class Bid {
	
	private int tricksToWin;
	private CardSuit trump;
	private FH_Player bidder;
	
	public Bid(int tricksToWin, CardSuit trump) {
		super();
		this.tricksToWin = tricksToWin;
		this.trump = trump;
	}

	public int getTricksToWin() {
		return tricksToWin;
	}

	public void setTricksToWin(int tricksToWin) {
		this.tricksToWin = tricksToWin;
	}

	public CardSuit getTrump() {
		return trump;
	}

	public void setTrump(CardSuit trump) {
		this.trump = trump;
	}
	
	public FH_Player getBidder() {
		return bidder;
	}

	public void setBidder(FH_Player bidder) {
		this.bidder = bidder;
	}

	/**
	 * Compares the values of the old bid to the parameters (the new bid). 
	 * If the parameters are greater, they define the new bid.
	 * 
	 * @param numOfTricks
	 * @param trump
	 * @return boolean to tell if the new bid was greater
	 */
	public boolean makeBid(FH_Player p, int tricksToWin, CardSuit trump) {
		//if trump is greater the new bid becomes the current bid
		if(trump.ordinal() > this.trump.ordinal()) {
			this.trump = trump;
			bidder = p;
			return true;
			//else if trump is same then
		} else if(trump.ordinal() == this.trump.ordinal()) {
			//if numOfTricks is greater the new bid becomes the current bid
			if(tricksToWin > this.tricksToWin) {
				this.tricksToWin = tricksToWin;
				bidder = p;
				return true;
			}
			//else fall through and current bid stays the same
		} 
		return false;
	}

}
