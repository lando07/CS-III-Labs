import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexagonTest {
    
    @Test
    void hexagonAreaTest1() {
        Hexagon t = new Hexagon(3);
        double area = t.area();
        assertEquals(23.382685902179844, area, 0.001);
    }

    @Test
    void hexagonAreaTest2() {
        Hexagon t = new Hexagon(5.8);
        double area = t.area();
        assertEquals(87.39928374992554, area, 0.001);
    }

    @Test
    void hexagonAreaTest3() {
        Hexagon t = new Hexagon(100.55);
        double area = t.area();
        assertEquals(26267.336414835958, area, 0.001);
    }

    @Test
    void hexagonPerimeterTest1() {
        Hexagon t = new Hexagon(3);
        double p = t.perimeter();
        assertEquals(18.0, p, 0.001);
    }

    @Test
    void hexagonPerimeterTest2() {
        Hexagon t = new Hexagon(5.8);
        double p = t.perimeter();
        assertEquals(34.8, p, 0.001);
    }

    @Test
    void hexagonPerimeterTest3() {
        Hexagon t = new Hexagon(100.55);
        double p = t.perimeter();
        assertEquals(603.3, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        Hexagon t = new Hexagon(10);
        String type = t.getType();
        assertEquals(type, "regular hexagon");
    }
}