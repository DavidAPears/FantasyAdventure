import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {
    MutationOfCourage mutationOfCourage;
    Golem golem;
    Warlock warlock;

    @Before
    public void before(){
        golem = new Golem();
        mutationOfCourage = new MutationOfCourage();
        warlock = new Warlock("Willy", 75, mutationOfCourage, golem );
    }



    @Test
    public void getName() {
        assertEquals("Willy", warlock.getName());
    }

    @Test
    public void getHealthPoints() {
        assertEquals(75, warlock.getHealthPoints());
    }

    @Test
    public void takeDamage() {
        warlock.takeDamage(20);
        assertEquals(60, warlock.getHealthPoints());
    }

    @Test
    public void giveHealth() {
        warlock.giveHealth(10);
        assertEquals(85, warlock.getHealthPoints());
    }
}