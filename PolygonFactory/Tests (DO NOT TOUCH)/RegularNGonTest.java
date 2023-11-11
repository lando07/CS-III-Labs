import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularNGonTest {
    
    @Test
    void regularngonAreaTest1() {
        RegularNGon t = new RegularNGon(5, 3);  // numSides, sideLength
        double area = t.area();
        assertEquals(15.484296605300704, area, 0.001);
    }

    @Test
    void regularngonAreaTest2() {
        RegularNGon t = new RegularNGon(6, 5.8);
        double area = t.area();
        assertEquals(87.39928374992554, area, 0.001);
    }

    @Test
    void regularngonAreaTest3() {
        RegularNGon t = new RegularNGon(8, 100.55);
        double area = t.area();
        assertEquals(48816.85883038922, area, 0.001);
    }

    @Test
    void regularngonPerimeterTest1() {
        RegularNGon t = new RegularNGon(4, 3);
        double p = t.perimeter();
        assertEquals(12.0, p, 0.001);
    }

    @Test
    void regularngonPerimeterTest2() {
        RegularNGon t = new RegularNGon(3, 5.8);
        double p = t.perimeter();
        assertEquals(17.4, p, 0.001);
    }

    @Test
    void regularngonPerimeterTest3() {
        RegularNGon t = new RegularNGon(10, 100.55);
        double p = t.perimeter();
        assertEquals(1005.5, p, 0.001);
    }

    @Test 
    void getTypeTest() {
        RegularNGon t = new RegularNGon(5, 10);
        String type = t.getType();
        assertEquals(type, "regular 5-gon");
    }
}