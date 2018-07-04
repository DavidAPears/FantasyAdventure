public class Treasure implements ITreasure{


    @Override
    public void doAction(PlayerCharacter player) {
        player.giveHealth(5);

    }
}
