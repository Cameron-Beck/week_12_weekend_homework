import org.junit.Before;
import org.junit.Test;
import player.Player;
import player.fighter.Knight;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;

    @Before
    public void before(){
     player1 = new Player("Steve", 100) {
     };
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", player1.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals(100, player1.getHp());
    }

    @Test
    public void canSetPlayerName(){
        player1.setName("Jon");
        assertEquals("Jon", player1.getName());
    }

    @Test
    public void canSetPlayerHP(){
        player1.setHp(200);
        assertEquals(200, player1.getHp());
    }

}
