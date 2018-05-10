package FiveHundred;

import PlayingCards.CardPlayer;
import PlayingCards.Hand;
import PlayingCards.PlayerType;

public class FH_Player extends CardPlayer {
	
	private Hand tricksWon;
	private int numOfTricksWon;
	private int score;
	private FH_Player teammate;
	
	public FH_Player(PlayerType pt) {
		super(pt);
	}

	public Hand getTricksWon() {
		return tricksWon;
	}

	public void setTricksWon(Hand trick) {
		this.tricksWon.addAll(trick);
	}
	
	public int getNumOfTricksWon() {
		return numOfTricksWon;
	}

	public void setNumOfTricksWon(int numOfTricksWon) {
		this.numOfTricksWon = numOfTricksWon;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public FH_Player getTeammate() {
		return teammate;
	}

	public void setTeammate(FH_Player teammate) {
		this.teammate = teammate;
	}

	public void resetCards() {
		setTricksWon(new Hand());
		setHand(new Hand());
	}

}
