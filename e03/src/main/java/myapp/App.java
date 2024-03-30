package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

    }
}

abstract class Car {
    abstract String startEngine();
    abstract String accelerate();
}

class SportsCar extends Car {

    @Override
    String startEngine() {
        return "Sports car starts engine with a roar!";
    }

    @Override
    String accelerate() {
       return "Sports car accelerates quickly!";
    }
    
} 

class FamilyCar extends Car {

    @Override
    String startEngine() {
        return "Family car starts engine smoothly.";
    }

    @Override
    String accelerate() {
       return "Family car accelerates steadily.";
    }
    
} 

