public class Troll implements ITroll {
    String name;
    int healthPoints;

    public Troll(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }


        @Override
        public void doAction (PlayerCharacter player){
            player.takeDamage(30);
        }
    }

