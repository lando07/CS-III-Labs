import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesTriangleTest {
    
    @Test
    void triangleAreaTest1() {
        Triangle t = new IsoscelesTriangle(2, 3);
        double area = t.area();
        assertEquals(1.984313483298443, area, 0.001);
    }

    @Test
    void triangleAreaTest2() {
        Triangle t = new IsoscelesTriangle(3.2, 5.8);
        double area = t.area();
        assertEquals(3.9230472849559157, area, 0.001);
    }

    @Test
    void triangleAreaTest3() {
        Triangle t = new IsoscelesTriangle(55, 100.55);
        double area = t.area();
        assertEquals(1121.2839629330574, area, 0.001);
    }

    @Test
    void trianglePerimeterTest1() {
        Triangle t = new IsoscelesTriangle(2, 3);
        double p = t.perimeter();
        assertEquals(7.0, p, 0.001);
    }

    @Test
    void trianglePerimeterTest2() {
        Triangle t = new IsoscelesTriangle(3.2, 5.8);
        double p = t.perimeter();
        assertEquals(12.2, p, 0.001);
    }

    @Test
    void trianglePerimeterTest3() {
        Triangle t = new IsoscelesTriangle(55, 100.55);
        double p = t.perimeter();
        assertEquals(210.55, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        Triangle t = new IsoscelesTriangle(5, 10);
        String type = t.getType();
        assertEquals(type, "isosceles triangle");
    }
}
