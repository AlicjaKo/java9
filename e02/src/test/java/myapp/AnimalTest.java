package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
   @Test
   public void testCatSound() {
      Cat cat = new Cat();
      String expectedSound = "Meow";
      String actualSound = cat.makeSound();
      assertEquals(expectedSound, actualSound);
   }

   @Test
   public void testDogSound() {
      Dog dog = new Dog();
      String expectedSound = "Woof";
      String actualSound = dog.makeSound();
      assertEquals(expectedSound, actualSound);
   }
}
