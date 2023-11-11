import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquilateralTriangleTest {
    
    @Test
    void triangleAreaTest1() {
        Triangle t = new EquilateralTriangle(3);
        double area = t.area();
        assertEquals(3.897114317029974, area, 0.001);
    }

    @Test
    void triangleAreaTest2() {
        Triangle t = new EquilateralTriangle(5.8);
        double area = t.area();
        assertEquals(14.566547291654254, area, 0.001);
    }

    @Test
    void triangleAreaTest3() {
        Triangle t = new EquilateralTriangle(100.55);
        double area = t.area();
        assertEquals(4377.889402472659, area, 0.001);
    }

    @Test
    void trianglePerimeterTest1() {
        Triangle t = new EquilateralTriangle(3);
        double p = t.perimeter();
        assertEquals(9.0, p, 0.001);
    }

    @Test
    void trianglePerimeterTest2() {
        Triangle t = new EquilateralTriangle(5.8);
        double p = t.perimeter();
        assertEquals(17.4, p, 0.001);
    }

    @Test
    void trianglePerimeterTest3() {
        Triangle t = new EquilateralTriangle(100.55);
        double p = t.perimeter();
        assertEquals(301.65, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        Triangle t = new EquilateralTriangle(10);
        String type = t.getType();
        assertEquals(type, "equilateral triangle");
    }
}
