public class Octagon extends RegularNGon {
    public Octagon(double sideLength) {
        super(8, sideLength);
    }

    @Override
    public String getType() {
        return "regular octagon";
    }

    @Override
    public String toString() {
        return "Regular octagon with area of " + super.area();
    }
}
