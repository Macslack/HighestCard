import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hands;

    public Player(String name){
        this.name = name;
        this.hands = new ArrayList<>();
    }
    public int totalHand(){
        return this.hands.size();
    }
    public void addCardtoPlayer(Deck deck){
        Card result = deck.removeCard();
        this.hands.add(result);
    }
    public void getCardFromDeckToHand(Deck deck){
        Card result = deck.removeCard();
        this.hands.add(result);
    }
    public ArrayList<Card> getHands() {
        return hands;
    }
    public int handValue(){
        int result = 0;

       for (Card card : this.hands){
           result += card.getValueFromEnum();
       }

       return result;
    }
    public void getCard(Card card){
         this.hands.add(card);
    }

}
