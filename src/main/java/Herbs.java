


public class Herbs implements IHeal {

    int health = 25;


    @Override
    public void heal(PlayerCharacter playerCharacter) {
        playerCharacter.giveHealth(health);
    }
}
