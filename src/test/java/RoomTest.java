import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Room room;
    Room room2;
    Room room3;
    ITroll troll;
    Treasure treasure;
    Dwarf dwarf;
    Cleric cleric;
    Knight knight;
    Wizard wizard;
    Warlock warlock;
    Club club;
    Axe axe;
    Sword sword;
    Potion potion;
    Herbs herb;
    Dragon dragon;
    Golem golem;
    LightningArrow lightningArrow;
    MutationOfCourage mutationOfCourage;



    @Before
    public void before() {
        knight = new Knight("Kenny", 99, sword);
        room = new Room(troll);

    }

    @Test
    public void getPlayerNumber() {
    }

    @Test
    public void roomAction() {
    }
}