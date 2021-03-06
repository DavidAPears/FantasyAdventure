import java.util.ArrayList;

public class Room {

    IRoom iroom;
    ArrayList<PlayerCharacter> players;

    public Room(IRoom iroom) {
        this.players = new ArrayList<>();
        this.iroom = iroom;
    }

    public int getPlayerNumber(){
        return this.players.size();
    }

    public void roomAction() {
        for (PlayerCharacter player : players){
            this.iroom.doAction(player);
            if (player.getHealthPoints() <= 0){
                this.removePlayer(player);
            }
        }
    }

    public void addPLayer(PlayerCharacter player){
        players.add(player);
    }

    public void removePlayer(PlayerCharacter player){
        players.remove(player);
    }


}
