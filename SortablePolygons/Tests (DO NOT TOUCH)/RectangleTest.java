
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    
    @Test
    void rectangleAreaTest1() {
        Rectangle r = new Rectangle(5, 2);
        double area = r.area();
        assertEquals(10.0, area, 0.001);
    }

    @Test
    void rectangleAreaTest2() {
        Rectangle r = new Rectangle(5.2, 2);
        double area = r.area();
        assertEquals(10.4, area, 0.001);
    }

    @Test
    void rectangleAreaTest3() {
        Rectangle r = new Rectangle(5.6, 2.2);
        double area = r.area();
        assertEquals(12.32, area, 0.001);
    }

    @Test
    void rectanglePerimeterTest1() {
        Rectangle r = new Rectangle(5, 2);
        double p = r.perimeter();
        assertEquals(14.0, p, 0.001);
    }

    @Test
    void rectanglePerimeterTest2() {
        Rectangle r = new Rectangle(5.2, 2);
        double p = r.perimeter();
        assertEquals(14.4, p, 0.001);
    }

    @Test
    void rectanglePerimeterTest3() {
        Rectangle r = new Rectangle(5.6, 2.2);
        double p = r.perimeter();
        assertEquals(15.6, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        Rectangle r = new Rectangle(10, 10);
        String t = r.getType();
        assertEquals(t, "rectangle");
    }
}
