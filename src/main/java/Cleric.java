

public class Cleric extends PlayerCharacter {

    private IHeal healingTool;

    public Cleric(String name, int healthPoints, IHeal healingTool) {
        super(name, healthPoints);
        this.healingTool = healingTool;

    }


}
