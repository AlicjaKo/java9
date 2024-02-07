package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeTest {
   @Test
   public void testTriangleArea() {
      Triangle triangle = new Triangle(10, 5);
      double expectedArea = 25;
      double actualArea = triangle.calculateArea();
      assertEquals(expectedArea, actualArea, 0.0001);
   }

   @Test
   public void testCircleArea() {
      Circle circle = new Circle(5);
      double expectedArea = 78.53981633974483;
      double actualArea = circle.calculateArea();
      assertEquals(expectedArea, actualArea, 0.0001);
   }
}