import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Deck deck;
    Card card;


    @Before
    public void before(){
        player = new Player("Player1");
        deck = new Deck();
    }
    @Test
    public void handStartsEmpty() {
        assertEquals(0, player.totalHand());
    }
    @Test
    public void playerCanGetCard() {
        player.addCardtoPlayer(deck);
        assertEquals(1, player.totalHand());
    }
    @Test
    public void canGetCard(){
        player.getCard(card);
        assertEquals(1, player.totalHand());
    }

}
