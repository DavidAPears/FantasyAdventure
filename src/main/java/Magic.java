

public abstract class Magic extends PlayerCharacter {

    public ISpell ispell;
    public ICreature icreature;

    public Magic(String name, int healthPoints, ISpell ispell, ICreature icreature) {
        super(name, healthPoints);
        this.ispell = ispell;
        this.icreature = icreature;
    }

    public void takeDamage(int damage){
        this.healthPoints -= icreature.defend(damage);
    }
}


