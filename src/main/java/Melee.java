public abstract class Melee extends  PlayerCharacter{

    public IWeapon iWeapon;

    public Melee(String name, int healthPoints, IWeapon iweapon) {
        super(name, healthPoints);
        this.iWeapon = iweapon;
    }

    public void useWeapon(ITroll troll){
        iWeapon.attack(troll);
    }
}
