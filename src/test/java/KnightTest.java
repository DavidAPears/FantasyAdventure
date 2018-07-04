import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {




    Sword sword;
    Knight knight;

    @Before
    public void before() {
        sword = new Sword();
        knight = new Knight("Kenny", 99, sword);
    }

    @Test
    public void getName() {
        assertEquals("Kenny", knight.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(99, knight.getHealthPoints());
    }

    @Test
    public void takeDamage() {
         knight.takeDamage(10);
        assertEquals(89, knight.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        knight.giveHealth(10);
        assertEquals(100, knight.getHealthPoints());
    }
}