package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResizableTest {
    @Test
    public void testWindowResize() {
        Resizable window = new Window();
        window.resize();
        assertEquals("Window is being resized by dragging the edges.", window.resize());
    }
    
    @Test
    public void testImageResize() {
        Resizable image = new Image();
        image.resize();
        assertEquals("Image is being resized by dragging the corners.", image.resize());
    }
}
