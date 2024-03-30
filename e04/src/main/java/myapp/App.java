package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

    }
}

interface Drawable {
    String draw();
}

class Rectangle implements Drawable {

    @Override
    public String draw() {
        return "Drawing a rectangle by connecting four lines.";
    }
    
}

class Circle implements Drawable {

    @Override
    public String draw() {
        return "Drawing a circle by creating a curved line that forms a closed loop.";
    }
    
}
