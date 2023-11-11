public class EquilateralTriangle extends IsoscelesTriangle {
    public EquilateralTriangle(double side) {
        super(side, side);
    }

    @Override
    public String getType() {
        return "equilateral triangle";
    }

    @Override
    public String toString() {
        return "Equilateral triangle with area of " + super.area();
    }
}
