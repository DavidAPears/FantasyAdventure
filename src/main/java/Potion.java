public class Potion implements  IHeal{

    int health = 5;
    @Override
    public void heal(Character character) {
        character.giveHealth(health);

    }
}
