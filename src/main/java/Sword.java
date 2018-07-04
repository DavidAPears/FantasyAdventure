public class Sword implements IWeapon {
    @Override
    public void attack(ITroll troll) {
        troll.takeDamage(35);

    }

    }

