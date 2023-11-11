import java.io.File;
import java.util.Scanner;

public class Diana {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("diana.dat"));
        while (file.hasNext()) {
            double x1 = file.nextDouble();
            double y1 = file.nextDouble();
            double z1 = file.nextDouble();
            double x2 = file.nextDouble();
            double y2 = file.nextDouble();
            double z2 = file.nextDouble();
            System.out.println(
                    Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2))*100.0) / 100.0);
        }
    }
}
