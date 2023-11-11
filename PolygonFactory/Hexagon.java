public class Hexagon extends RegularNGon {

    public Hexagon(double sideLength) {
        super(6, sideLength);
    }

    @Override
    public String getType() {
        return "regular hexagon";
    }

    @Override
    public String toString() {
        return "Hexagon with area of " + super.area();
    }
}