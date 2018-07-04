public class Axe implements IWeapon {
    @Override

    public void attack(ITroll troll) {
        troll.takeDamage(30);

    }
}
