import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwarfTest {

    Axe axe;
    Dwarf dwarf;

    @Before
    public void before() {
        axe = new Axe();
        dwarf = new Dwarf("Davey", 50, axe);
    }

    @Test
    public void getName() {
        assertEquals("Davey", dwarf.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        dwarf.takeDamage(10);
        assertEquals(40, dwarf.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        dwarf.giveHealth(10);
        assertEquals(60, dwarf.getHealthPoints());
    }
}