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
        herb = new Herbs();
        sword = new Sword();
        knight = new Knight("Kenny", 99, sword);
        cleric = new Cleric("Charlie", 77, herb);
        troll = new Troll("Barry", 99);
        treasure = new Treasure();
        room = new Room(troll);
        room.addPLayer(knight);
        room.addPLayer(cleric);
        room2 = new Room(treasure);


    }

    @Test
    public void getPlayerNumber() {
        assertEquals(2, room.getPlayerNumber());
    }

    @Test
    public void roomAction() {
        room.roomAction();
        assertEquals(69, knight.healthPoints);
    }

    @Test
    public void trollDamage(){
        knight.useWeapon(troll);
        assertEquals(65, troll.getHealthPoints());
        knight.useWeapon(troll);
        assertEquals(30, troll.getHealthPoints());

    }

    @Test
    public void treasureChestTest(){
        room2.addPLayer(knight);
        room2.addPLayer(cleric);
        room2.roomAction();
        System.out.println(knight.treasure);
        System.out.println(cleric.treasure);
    }



//    @Test
//    public void deadKnightLeavesRoom(){
//        room.roomAction();
//        room.roomAction();
//        room.roomAction();
//        room.roomAction();
//        assertEquals(0, room.getPlayerNumber());
//    }
}