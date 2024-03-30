package myapp;

public class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {
        Cat cat = new Cat();

        cat.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}

abstract class Animal {
    abstract String makeSound();
}

class Cat extends Animal {
    @Override
    String makeSound() {
        return "Meow";
    }
}

class Dog extends Animal {
    @Override
    String makeSound() {
        return "Woof";
    }
}