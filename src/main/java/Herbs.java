public class Herbs implements  IHeal{

    int health = 25;

    @Override
    public void heal(Character character) {
        character.giveHealth(health);

    }
}
