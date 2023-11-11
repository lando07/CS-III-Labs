import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PentagonTest {
    
    @Test
    void pentagonAreaTest1() {
        Pentagon t = new Pentagon(3);
        double area = t.area();
        assertEquals(15.484296605300704, area, 0.001);
    }

    @Test
    void pentagonAreaTest2() {
        Pentagon t = new Pentagon(5.8);
        double area = t.area();
        assertEquals(57.876859755812845, area, 0.001);
    }

    @Test
    void pentagonAreaTest3() {
        Pentagon t = new Pentagon(100.55);
        double area = t.area();
        assertEquals(17394.546964368135, area, 0.001);
    }

    @Test
    void pentagonPerimeterTest1() {
        Pentagon t = new Pentagon(3);
        double p = t.perimeter();
        assertEquals(15.0, p, 0.001);
    }

    @Test
    void pentagonPerimeterTest2() {
        Pentagon t = new Pentagon(5.8);
        double p = t.perimeter();
        assertEquals(29.0, p, 0.001);
    }

    @Test
    void pentagonPerimeterTest3() {
        Pentagon t = new Pentagon(100.55);
        double p = t.perimeter();
        assertEquals(502.75, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        Pentagon t = new Pentagon(10);
        String type = t.getType();
        assertEquals(type, "regular pentagon");
    }
}