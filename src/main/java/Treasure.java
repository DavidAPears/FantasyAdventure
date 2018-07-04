import java.util.Random;

public class Treasure implements ITreasure{


    Random rand = new Random();
    int treasure;

    public Treasure(){
        this.treasure = rand.nextInt(1000) + 1;
    }


    @Override
    public void doAction(PlayerCharacter player) {
        player.getTreasure(treasure);

    }
}
