public abstract class Character {

    private String name;
    private int healthPoints;

    public Character(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void takeDamage(int damage){
        this.healthPoints -= damage;
    }

    public void giveHealth(int health){
        this.healthPoints += health;
    }


}
