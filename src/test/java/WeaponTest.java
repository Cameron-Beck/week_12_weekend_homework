import abilities.weapons.Sword;
import abilities.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Player player1;
    Sword sword1;

    @Before
    public void before() {
        player1 = new Player("Steve", 100) {
        };
        sword1 = new Sword("Stinger",30);
    }

    @Test
    public void canGetSwordName() {
        assertEquals("Stinger", sword1.getName());
    }

    @Test
    public void canGetSwordDamage(){
        assertEquals(30, sword1.getDamage());
    }
}