public class Rectangle extends Polygon {
    double l;
    double w;

    public Rectangle(double sideLength, double sideWidth) {
        l = sideLength;
        w = sideWidth;
    }

    @Override
    public double area() {
        return l*w;
    }

    @Override
    public double perimeter() {
        return l + l + w + w;
    }

    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public String toString(){
        return "Rectangle with area of " + area() + " and perimeter of " + perimeter();
    }
}
