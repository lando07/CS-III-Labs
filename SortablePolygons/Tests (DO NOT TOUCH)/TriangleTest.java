
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    
    @Test
    void triangleAreaTest1() {
        Triangle t = new Triangle(3, 4, 5);
        double area = t.area();
        assertEquals(6.0, area);
    }

    @Test
    void triangleAreaTest2() {
        Triangle t = new Triangle(5, 4, 3);
        double area = t.area();
        assertEquals(6.0, area);
    }

    @Test
    void triangleAreaTest3() {
        Triangle t = new Triangle(5.6, 2.2, 7.5);
        double area = t.area();
        assertEquals(3.580564725011969, area);
    }

    @Test
    void trianglePerimeterTest1() {
        Triangle t = new Triangle(3, 4, 5);
        double p = t.perimeter();
        assertEquals(12.0, p);
    }

    @Test
    void trianglePerimeterTest2() {
        Triangle t = new Triangle(5, 4, 3);
        double p = t.perimeter();
        assertEquals(12.0, p);
    }

    @Test
    void trianglePerimeterTest3() {
        Triangle t = new Triangle(5.6, 2.2, 7.5);
        double p = t.perimeter();
        assertEquals(15.3, p);
    }

    @Test 
    void getTypeTest() {
        Triangle t = new Triangle(10,10, 10);
        String type = t.getType();
        assertEquals(type, "triangle");
    }
}
