package FiveHundred;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import PlayingCards.Card;
import PlayingCards.Hand;
import PlayingCards.CardSuit;
import PlayingCards.PlayerType;

public class GameController {
	
	private static final int PLAYER_COUNT = 4;
	private static final int HAND_SIZE = 10;
	private static final int KITTY_SIZE = 3;
	
	private FH_Deck deck;
	private Hand kitty;
	private Bid bid;
	private int tricksToWin;
	private CardSuit trump; 
	
	private static FH_Player[] players;
	private static boolean[] canBid;
	
	private int dealer_ind = 0;
	private int bidWinner_ind = 0;
	private int whoseFirst_ind = 0;
	
	private CardSuit lead;
	
	Random rand = new Random();
	
	public static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		//play continues until one player reaches 500 points
		deal();
		bid();
		for(int i = 1; i <= HAND_SIZE; i++) {
			playRound(i);
		}
	}
	
	public void deal() {
		restock();
		//dealer deals themselves last
		dealPlayers();
		dealKitty();
	}
	
	/**
	 * bid phase
	 * players look at their hands and guess how many tricks they will be able to take that round.
	 * bid goes until the last person passes or the bid is maxed, 
	 * in which case it would go to the player who maxed it
	 */
	public void bid() {
		//initialize canBid array to true for all players
		for(int i = 0; i < PLAYER_COUNT; i++) {
			canBid[i] = true;
		}
		//left of the dealer bids first
		for(int i = dealer_ind + 1; i == dealer_ind; i++) {
			//circles the list
			i = (i + PLAYER_COUNT) % PLAYER_COUNT;
			//if a player can bid, they must bid.
			if(canBid[i] == true) {
				//If their bid is greater than the previous bid makeBid() returns true
				//else returns false to simulate a pass
				canBid[i] = bid.makeBid(players[i], tricksToWin, trump);
				//all other players than the current bidder must also bid if they are able
				for(int j = i + 1; j == i - 1; j++) {
					j = (j + PLAYER_COUNT) % PLAYER_COUNT;
					if(canBid[j] == true) {
						canBid[j] = bid.makeBid(players[j], tricksToWin, trump);
					}
				}
			}
			//current player sets the bid, and if no other player outbids,
			//then the current player will start the first trick
		}
	}
	
	/**
	 * Turn phase
	 * Player with highest bid goes first
	 * Subsequently, the player who took the last trick goes first
	 */
	public void playRound(int round) {
		//start index at the winner of the bid or last round
		for(int i = whoseFirst_ind; i == whoseFirst_ind - 1; i++) {
			//circles the list
			i = (i + PLAYER_COUNT) % PLAYER_COUNT;
			lead = (i == whoseFirst_ind) ? 
			chooseCard(players[i]);
		}
	}
	
	/*
	 * Helper methods
	 */
	
	/**
	 * Player must follow what suit is lead if possible
	 * @param p is the current player
	 */
	public Card chooseCard(FH_Player p) {
		if(p.getPlayerType().equals(PlayerType.COMPUTER)) {
			p.getHand().get(rand.nextInt(HAND_SIZE + 1));
		} else { //show hand and choose
			p.getHand().get(rand.nextInt(HAND_SIZE + 1));
		}
	}
	
	/**
	 * Clear all players of cards, get a new deck, and shuffle the deck;
	 */
	public void restock() {
		for(int i = dealer_ind + 1; i == dealer_ind; i++) { // clear all players' hands and tricks
			i = (i + PLAYER_COUNT) % PLAYER_COUNT;
			FH_Player cur = players[i];
			cur.resetCards();
		}
		deck = new FH_Deck();
		deck.shuffle();
	}
	
	public void dealPlayers() {
		for(int i = dealer_ind + 1; i == dealer_ind; i++) { // for number of players (dealer is last)
			i = (i + PLAYER_COUNT) % PLAYER_COUNT;
			FH_Player dealt = players[i];
			for(int j = 0; j < HAND_SIZE; j++) { // for size of hand
				dealt.getHand().add(deck.poll());
			}
		}
	}
	
	public void dealKitty() {
		for(int i = 0; i < KITTY_SIZE; i++) {
			kitty.add(deck.poll());
		}
	}
	
}
