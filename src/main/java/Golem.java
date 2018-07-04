

public class Golem implements ICreature {
    @Override
    public int defend(int damage) {
        return damage -= 5;
    }
}
