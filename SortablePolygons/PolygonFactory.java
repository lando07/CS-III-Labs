import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class PolygonFactory {
    private static ArrayList<Polygon> polygons = new ArrayList<Polygon>();
    private static Scanner console = new Scanner(in);
    private static final String ELES = "Enter the length of each side >>> ";
    private static final String INVALID = "\nInvalid option, returning to main menu";

    public static void main(String[] args) {
        out.println("**********************************************************\n");
        out.println("Welcome to the Polygon Factory!\n");
        out.println("**********************************************************\n");

        // your code here
        boolean stillUsing = true;
        while (stillUsing) {
            out.print("What would you like to do?" +
                    "\n1) Make a polygon" +
                    "\n2) Print out regular polygons" +
                    "\n3) Exit" +
                    "\n >>> ");
            try {
                int option = console.nextInt();
                out.println();
                switch (option) {
                    case 1:
                        makePolygon();
                        out.println();
                        break;
                    case 2:
                        printPolygon();
                        out.println();
                        break;
                    case 3:
                        stillUsing = false;
                        out.println();
                        break;
                    default:
                        out.println("Invalid option");
                }

            } catch (InputMismatchException IME) {
                out.println("Invalid Option");
            }
        }
    }

    private static void printPolygon() {
        for (Polygon p : polygons) {
            out.println(p);
        }
        out.println();
    }

    private static void makePolygon() {
        out.print("What polygon do you want to make?" +
                "\n1) A Regular polygon with 'n' amount of sides" +
                "\n2) A Triangle" +
                "\n3) A Rectangle" +
                "\n4) A Regular Pentagon" +
                "\n5) A Regular Hexagon" +
                "\n6) A Regular Octagon" +
                "\n7) Exit" +
                "\n>>> ");
        try {
            int option = console.nextInt();
            switch (option) {
                case 1:
                    out.print("Enter number of sides >>> ");
                    int sides = console.nextInt();
                    out.print("Enter sideLength >>> ");
                    double length = console.nextDouble();
                    polygons.add(new RegularNGon(sides, length));
                    break;
                case 2:
                    makeTriangle();
                    break;
                case 3:
                    out.print("Enter Rectangle length >>> ");
                    int sLength = console.nextInt();
                    out.print("Enter Rectangle width >>> ");
                    double sWidth = console.nextDouble();
                    polygons.add(new Rectangle(sLength, sWidth));
                    break;
                case 4:
                    out.print(ELES);
                    double pLength = console.nextDouble();
                    polygons.add(new Pentagon(pLength));
                    break;
                case 5:
                    out.print(ELES);
                    double hLength = console.nextDouble();
                    polygons.add(new Hexagon(hLength));
                    break;
                case 6:
                    out.print(ELES);
                    double oLength = console.nextDouble();
                    polygons.add(new Octagon(oLength));
                    break;
                default:
                    out.println(INVALID);
                    return;
            }
            out.println(polygons.get(polygons.size() - 1));
        } catch (InputMismatchException IME) {
            out.println(INVALID);
        }
    }

    private static void makeTriangle() {
        out.print("What triangle do you want to make?" +
                "\n1) Scalene Triangle" +
                "\n2) Isosceles Triangle" +
                "\n3) Equilateral Triangle" +
                "\n>>> ");
        try {
            int option = console.nextInt();
            double side1;
            double side2;
            double side3;
            switch (option) {
                case 1:
                    out.print("Enter side length 1 >>> ");
                    side1 = console.nextDouble();
                    out.print("Enter side length 2 >>> ");
                    side2 = console.nextDouble();
                    out.print("Enter side lenght 3 >>> ");
                    side3 = console.nextDouble();
                    polygons.add(new Triangle(side1, side2, side3));
                    break;
                case 2:
                    out.print("Enter equal side pair length >>> ");
                    side1 = console.nextDouble();
                    out.print("Enter unique side length >>> ");
                    side2 = console.nextDouble();
                    polygons.add(new IsoscelesTriangle(side1, side2));
                    break;
                case 3:
                    out.print("Enter side length >>> ");
                    side1 = console.nextDouble();
                    polygons.add(new EquilateralTriangle(side1));
                    break;
                default:
                    out.println(INVALID);
            }
        } catch (InputMismatchException IME) {
            out.println(INVALID);
        }
    }
}
