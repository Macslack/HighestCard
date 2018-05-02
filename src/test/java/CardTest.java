import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;

    @Before
    public void before(){
        card = new Card(Suit.SPADES, Rank.ACE);
    }
    @Test
    public void canGetSuit(){
        assertEquals(Suit.SPADES, card.getSuit());
    }
    @Test
    public void canGEtRank(){
        assertEquals(Rank.ACE, card.getRank());
    }
    @Test
    public void canGetRankValue(){
        int value = card.getValueFromEnum();
        assertEquals(1, value);
    }


//    @Test
//    public void suitCanBeMispelled(){
//        Card wrongCard = new Card("Spaaaadesss", 1);
//        assertEquals("Spaaaadess", wrongCard.getSuit());
//    }
//    @Test
//    public void suitCanBeBananas(){
//        Card bananaCard = new Card("Bananas", 1);
//        assertEquals("Bananas", bananaCard.getSuit());
//    }
}
