package PlayingCards;
import java.util.List;

public class CardPlayer {

	private PlayerType playerType;
	private String name;
	private Hand hand;

	public CardPlayer(PlayerType playerType) {
		super();
	}
	
	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType pt) {
		this.playerType = pt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
}
