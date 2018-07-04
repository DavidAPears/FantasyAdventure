public class Club implements IWeapon {
    @Override
    public void attack(ITroll troll) {
        troll.takeDamage(20);

    }

    }

