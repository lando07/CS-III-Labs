import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.*;

public class CarShop {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        try (Scanner file = new Scanner(new File("cars.csv"));) {
            file.nextLine();

            while (file.hasNextLine()) {
                String[] row = file.nextLine().split(",");
                String carName = row[0];
                String carType = row[1];
                int carHP = Integer.parseInt(row[8]);
                out.println(carName + " " + carType + " " + carHP);
                cars.add(new Car(carName, carType, carHP));

            }
        } catch (FileNotFoundException FNFE) {
            out.println("File not found");
        }

        Collections.sort(cars, Comparator.reverseOrder());
        for (Car c : cars)
            out.println(c);
    }
}
