import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class SortablePolygonTester {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Polygon> polygons = new ArrayList<Polygon>();
        Comparator<Polygon> c = Collections.reverseOrder();
        polygons.add(new EquilateralTriangle(r.nextInt(0, 100000)));
        polygons.add(new EquilateralTriangle(r.nextInt(0, 100000)));
        polygons.add(new Hexagon(r.nextInt(0, 100000)));
        polygons.add(new Hexagon(r.nextInt(0, 100000)));
        polygons.add(new IsoscelesTriangle(r.nextInt(0, 10000), r.nextInt(0, 100000)));
        polygons.add(new IsoscelesTriangle(r.nextInt(0, 10000), r.nextInt(0, 100000)));
        polygons.add(new Octagon(r.nextInt(0, 100000)));
        polygons.add(new Octagon(r.nextInt(0, 100000)));
        polygons.add(new Pentagon(r.nextInt(0, 100000)));
        polygons.add(new Pentagon(r.nextInt(0, 100000)));
        polygons.add(new Rectangle(r.nextInt(0, 100000), r.nextInt(0, 100000)));
        polygons.add(new Rectangle(r.nextInt(0, 100000), r.nextInt(0, 100000)));
        polygons.add(new Triangle(r.nextInt(0, 10000), r.nextInt(0, 10000),
                r.nextInt(0, 100000)));
        polygons.add(new Triangle(r.nextInt(0, 10000), r.nextInt(0,10000), r.nextInt(0, 100000)));
        polygons.add(new RegularNGon(r.nextInt(0, 100000), r.nextInt(0, 100000)));
        polygons.add(new RegularNGon(r.nextInt(0, 100000), r.nextInt(0, 100000)));
        Collections.sort(polygons, c);
        for (Polygon p : polygons) {
            out.println(p);
        }

    }
}
