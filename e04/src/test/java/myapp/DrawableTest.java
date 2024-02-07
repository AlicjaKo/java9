package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DrawableTest {
    @Test
    public void testRectangleDraw() {
        Drawable rect = new Rectangle();
        rect.draw();
        assertEquals("Drawing a rectangle by connecting four lines.", rect.draw());
    }
    
    @Test
    public void testCircleDraw() {
        Drawable circ = new Circle();
        circ.draw();
        assertEquals("Drawing a circle by creating a curved line that forms a closed loop.", circ.draw());
    }
}