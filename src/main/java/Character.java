public abstract class Character {

    private String name;
    private int healthPoints;
    private int maxHealth;

    public Character(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.maxHealth = 100;
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


}
