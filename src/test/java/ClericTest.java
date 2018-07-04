import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Herbs herbs;
    Potion potion;

    @Before
    public void before() {
        cleric = new Cleric("Fixian Wounded", 50, herbs);


    }

    @Test
    public void getName() {
        assertEquals("Fixian Wounded", cleric.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(50, cleric.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        cleric.takeDamage(1);
        assertEquals(49, cleric.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        cleric.giveHealth(1);
        assertEquals(51, cleric.getHealthPoints());
    }

    @Test
    public void hasMaxHealth() {
        cleric.giveHealth(51);
        assertEquals(100, cleric.getHealthPoints());
    }
}