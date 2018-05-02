import java.util.ArrayList;

public class Game {
      private ArrayList<Player> players;
      private Deck deck;

      public Game() {
          this.players = new ArrayList<>();
          this.deck = deck;
      }
      public int getNumberOfPlayers() {
          return this.players.size();
      }
      public void addPlayer(Player player){
          this.players.add(player);
      }
      public Player highestCard(){
          Player winningPlayer = this.players.get(0);

          for (Player player : this.players){
                if(player.handValue() > winningPlayer.handValue()){
                    winningPlayer = player;
                }
          }

          return winningPlayer;
      }
}
