import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {
    LightningArrow lightningArrow;
    Dragon dragon;
    Wizard wizard;

    @Before
    public void before(){
        dragon = new Dragon();
        lightningArrow = new LightningArrow();
        wizard = new Wizard("Eric", 75, lightningArrow, dragon );
    }



    @Test
    public void getName() {
        assertEquals("Eric", wizard.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(75, wizard.getHealthPoints());
    }

    @Test
    public void takeDamage1() {
        wizard.takeDamage(20);
        assertEquals(65, wizard.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        wizard.giveHealth(10);
        assertEquals(85, wizard.getHealthPoints());
    }
}