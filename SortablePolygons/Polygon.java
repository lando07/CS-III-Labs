public abstract class Polygon implements Comparable<Polygon> {
    public abstract double area();

    public abstract double perimeter();

    public abstract String getType();

    public int compareTo(Polygon p) {
        if (area() != p.area())
            return area() - p.area() > 0 ? 1 : -1;
        if (perimeter() != p.perimeter())
            return perimeter() - p.perimeter() > 0 ? 1 : -1;
        return 0;
    }

    @Override
    public String toString() {
        return getType() + " with area " + area() + " and perimeter of " + perimeter();
    }
}