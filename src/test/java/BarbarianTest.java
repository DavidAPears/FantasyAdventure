import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {



    Club club;
    Barbarian barbarian;

    @Before
    public void before() {
        club = new Club();
        barbarian = new Barbarian("Barry", 80, club);
    }

    @Test
    public void getName() {
        assertEquals("Barry", barbarian.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(80, barbarian.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        barbarian.takeDamage(10);
        assertEquals(70, barbarian.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        barbarian.giveHealth(10);
        assertEquals(90, barbarian.getHealthPoints());
    }
}