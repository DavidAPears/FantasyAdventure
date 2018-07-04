public class Cleric extends Character{

    private  IHeal healingTool;

    public Cleric(String name, int healthPoints, IHeal healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;


    }


}
