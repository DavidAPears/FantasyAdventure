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
        troll = new Troll("Barry", 99);
        room = new Room(troll);
        room.addPLayer(knight);

    }

    @Test
    public void getPlayerNumber() {
        assertEquals(1, room.getPlayerNumber());
    }

    @Test
    public void roomAction() {
        room.roomAction();
        assertEquals(69, knight.healthPoints);
    }
}