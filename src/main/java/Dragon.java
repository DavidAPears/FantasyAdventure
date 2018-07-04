

public class Dragon implements ICreature {


    @Override
    public int defend(int damage) {
        return damage -= 10;

    }
}
