public abstract class PlayerCharacter {

    private String name;
    protected int healthPoints;
    private int maxHealth;
    protected int treasure;

    public PlayerCharacter(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = 100;
        this.treasure = 0;
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
        if (this.healthPoints + health <= this.maxHealth){
            this.healthPoints += health;
        } else {
            this.healthPoints = maxHealth;
        }

    }

    public void getTreasure(int treasure){
        this.treasure += treasure;
    }


    public int treasure(){
        return this.treasure;
    }


}
