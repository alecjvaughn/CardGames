Alec Vaughn
Sep 1, 2017

Table of Contents
"	Preface
"	Introduction
"	Glossary
"	User Requirements
"	System Architecture
"	System Requirements
"	System Models
"	System Evolution
"	Appendix
"	Index
"	Contribution Summary
"	Acceptance Paragraph
"	Design Assignments

500 Card Game

Preface

Developed by: Alec Vaughn

Revision History

Name	Date	Change Summary	Version
Alec Vaughn	9/1/2017	Initial Draft	1.0 (Draft)


Introduction

500 or Five Hundred is a trick-taking game that combines elements of Spades, Euchre, and Bridge. The game is most commonly played by four players in partnerships. 500 is a social card game and was popular in the United States until around 1920. It continues to be a popular game in Australia and New Zealand.
The object of the game is to score 500 points by making bids and taking tricks.

Glossary

Term	Def
Widow/Kitty
Miser
Open Miser
Trick
Trump

User Requirements

1.	The cards
1.1.	The joker is the highest-ranked trump or highest-ranked card in no trump.
1.2.	When trump is declared, the second-highest card is the jack of trumps
1.3.	The third-highest is the jack of the other suit of the same color as the trump.
1.4.	The ranks continue from ace (high) to 7.
1.5.	The bidding denominations rank from no trump to hearts, diamonds, clubs, and finally spades.
2.	The Deal
2.1.	Each player draws a card, with the low card determining the first dealer, with the ace (low) and the joker the lowest card.
2.2.	Redraw when more than one player draws the same lowest rank.
2.3.	The dealer shuffles the deck and deals three cards at one time to each player, face down and clockwise, beginning with the person to the dealer's left.
2.4.	Three cards are then placed into a widow/kitty face down.
2.5.	The dealer then deals four cards to each player and, finally, three cards to each player.
3.	The Bid
3.1.	The player to the dealer's left starts the bidding,
3.2.	Bid continues clockwise until each player has one turn to bid.
3.3.	Each player may either pass or bid.
3.4.	If a player bids, that bid must be a higher value than the previous bid.
3.5.	Each bid must indicate the trump suit or no trump and the number of tricks to be taken, from six to ten.
3.6.	If all players pass, the hand is thrown in, and the next dealer deals a new hand.
4.	The Play
4.1.	The player who declares the highest bid wins the contract, and the other two players unite to become the contractor's opponents.
4.2.	At this point before play, the contractor claims the widow and discards three losers, which can also include cards in the widow.
4.3.	The contractor leads to the first trick
4.4.	subsequently the winner of a trick leads to the next trick.
4.5.	Any card may be led, and the other two players must follow suit if able.
4.6.	If unable to follow suit, you may play any card.
4.7.	The highest card in the suit wins the trick unless a trump is played.
4.8.	If more than one trump is played, the highest trump wins.
4.9.	When there is trump, the joker is the highest trump, it must follow suit when trumps are led.
4.10.	You cannot play the joker if you have at least one card of a nontrump suit led.
4.11.	If there is no trump, the joker belongs to no suit until it is played.
4.12.	If you lead the joker in no trump, you must specify what suit it is.
4.13.	In a no-trump contract, the joker is the highest-ranked card.
5.	The Score
5.1.	If you become the contractor and win the number of tricks bid, you receive the number of points designated in the scoring table.
5.1.1.	If you win more tricks than bid, you receive no additional points. For example, if you bid 8 diamonds and win 9 tricks, you score 280 points, not 380 points.
5.1.2.	The only exception to this rule is if you win all 10 tricks and your bid was less than 250 points. In this case, you score 250 points.
5.2.	If you fail to make your contract, you must deduct that same number of points from your running score.
5.3.	It is possible to be in the negative.
5.4.	Meanwhile, each opponent scores 10 points for each trick he or she takes.
5.5.	It does not matter whether the contract is made or not, and one opponent cannot count what the other opponent takes.
5.6.	If one player reaches or exceeds 500 points after a hand, that player wins the game.
5.7.	If the contractor and one or both opponents reach or exceed 500 points after a hand, the contractor wins, and it does not matter if the contractor has fewer points.
5.8.	If only the two opponents reach or exceed 500 points during play, the one who takes the first trick wins the game.
5.9.	If one player reaches or exceeds a minus 500, that player must continue play until an opponent wins the game.
5.10.	If that player later reaches or exceeds 500, no one wins the game.

System Architecture

The 500 Card Game will consist of the following
"	Game Controller
o	Controls bidding
"	Who has bid
"	Who has highest bid
o	Handles turn order
"	Play directed left of dealer
o	Handles updates to the player's:
"	Hand
"	Score
"	AI
o	Dictates
"	the non-players' bid
"	non-players' card lay
"	Game Record Database
o	Entry holds
"	player name
"	player count
"	rounds played
"	tricks bid
"	tricks taken
"	final score
"	Standalone desktop UI
o	login window
o	game window
"	player icons
"	hands
"	table
"	score info
"	Login Support
o	Stores player information
o	Login as player
"	Recent
"	New
"	Search played
o	Play as guest option

System Requirements

System Models

System Evolution

"	Web UI
"	Mobile
"	Game Center and Google Play Support
"	AI Handicap Levels

Appendices

Design Mockups
