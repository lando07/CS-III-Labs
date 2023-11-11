public class RegularNGon extends Polygon {
    private int nSides;
    private double sideLength;

    public RegularNGon(int nSides, double sideLength) { // creates equal sided polygon with nSides
        this.nSides = nSides;
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return (Math.pow(sideLength, 2) * nSides) / (4.0 * Math.tan(Math.PI / nSides));
    }

    @Override
    public double perimeter() {
        return nSides * sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public String getType() {
        return "regular " + nSides + "-gon";
    }

    @Override
    public String toString() {
        return "Regular " + nSides + "-gon with area " + area();
    }

}
