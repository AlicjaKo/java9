package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovableTest {
    @Test
    public void testPlayerMoves() {
        Movable player = new Player();
        assertEquals("Player moving up.", player.upKey());
        assertEquals("Player moving down.", player.downKey());
        assertEquals("Player moving left.", player.leftKey());
        assertEquals("Player moving right.", player.rightKey());

    }
    
    @Test
    public void testComputerMoves() {
        Movable computer = new Computer();
        assertEquals("Computer moving up.", computer.upKey());
        assertEquals("Computer moving down.", computer.downKey());
        assertEquals("Computer moving left.", computer.leftKey());
        assertEquals("Computer moving right.", computer.rightKey());

    }
}
