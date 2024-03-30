package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

    }
}


interface Resizable {
    String resize();
}

class Window implements Resizable{

    @Override
    public String resize() {
       return "Window is being resized by dragging the edges.";
    }
    
}

class Image implements Resizable {
    
    @Override
    public String resize() {
        return "Image is being resized by dragging the corners.";
    }
}

/*
 * 
 * 
- Create an interface named `Resizable` with a method named `resize`. 
- Create a class named `Window` that implements the `Resizable` interface. 
- In the `Window` class, implement the `resize` method to return a description of the behaviour of resizing a window. 
- Then, create a class named `Image` that extends the `Window` class and overrides the `resize` method to return a description the behaviour of resizing an image.

💡 Hints:

- Window is being resized by dragging the edges.
- Image is being resized by dragging the corners.

Expected output

    Window is being resized by dragging the edges.
    Image is being resized by dragging the corners.

 */