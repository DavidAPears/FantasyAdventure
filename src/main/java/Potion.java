

public class Potion implements IHeal {

    int health = 5;
    @Override
    public void heal(PlayerCharacter playerCharacter) {
        playerCharacter.giveHealth(health);

    }
}
