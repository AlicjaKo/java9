package myapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
   @Test
   public void testSportsCar() {
      SportsCar sportsCar = new SportsCar();
      sportsCar.startEngine();
      assertEquals("Sports car starts engine with a roar!", sportsCar.startEngine());
      sportsCar.accelerate();
      assertEquals("Sports car accelerates quickly!", sportsCar.accelerate());
   }

   @Test
   public void testFamilyCar() {
      FamilyCar familyCar = new FamilyCar();
      familyCar.startEngine();
      assertEquals("Family car starts engine smoothly.", familyCar.startEngine());
      familyCar.accelerate();
      assertEquals("Family car accelerates steadily.", familyCar.accelerate());
   }
}