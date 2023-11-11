public class Pentagon extends RegularNGon {
    public Pentagon(double sideLength) {
        super(5, sideLength);
    }

    @Override
    public String getType() {
        return "regular pentagon";
    }

    @Override
    public String toString() {
        return "Regular pentagon with area of " + super.area();
    }
}
