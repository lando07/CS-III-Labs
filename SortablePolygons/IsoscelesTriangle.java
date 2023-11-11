public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double equalSide, double unequalSide) {
        super(equalSide, equalSide, unequalSide);
    }

    // Perimeter method does not need to be modified

    @Override
    public String getType() {
        return "isosceles triangle";
    }

    @Override
    public String toString() {
        return "Isosceles triangle with area of " + super.area();
    }
}
