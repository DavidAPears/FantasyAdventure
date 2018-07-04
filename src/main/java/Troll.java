public class Troll implements ITroll {
    String name;
    int healthPoints;

    public Troll(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = 100;
    }


        @Override
        public void doAction (PlayerCharacter player){
            player.takeDamage(30);
        }

        public void takeDamage( int damage){
          this.healthPoints -= damage;
        }


        public int getHealthPoints(){
         return this.healthPoints;
        }


}

