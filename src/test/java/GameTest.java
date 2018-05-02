import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Deck deck;
    Player player;
    Player player1;
    Player player2;
    Game game;
    Card card;
    Card card1;
    Card card2;
    Card card3;

    @Before
    public void before(){

        deck = new Deck();
        player = new Player("Callum");
        player1 = new Player("Alan");
        player2 = new Player("Bob");
        card1 = new Card(Suit.SPADES,Rank.KING);
        card2 = new Card(Suit.SPADES,Rank.FIVE);
        card3 = new Card(Suit.SPADES,Rank.FOUR);
        game = new Game();
    }
    @Test
    public void canAddPlayer(){
        game.addPlayer(player);
        assertEquals(1, game.getNumberOfPlayers());
    }
    @Test
    public void canGetNumberOfPlayers(){
        assertEquals(0, game.getNumberOfPlayers());
    }
    @Test
    public void canGetCardFromDeckToHand(){
            player.getCardFromDeckToHand(deck);
        assertEquals(1, player.totalHand());
    }
    @Test
    public void canGetWinningPlayer(){
        game.addPlayer(player);
        player.getCard(card3);
        game.addPlayer(player1);
        player1.getCard(card2);
        game.addPlayer(player2);
        player2.getCard(card1);
        assertEquals(player2, game.highestCard());
    }

}
