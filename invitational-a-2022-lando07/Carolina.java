import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Carolina {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("carolina.dat"));
        int sumPrice = 0;
        double taxTotal = 0;
        double totalOfAllTotals = 0;
        while (file.hasNextLine()) {
            double price = file.nextDouble();
            double taxed = price * 0.0825;
            double total = taxed + price;
            sumPrice += price;
            taxTotal += taxed;
            totalOfAllTotals += total;
            out.printf("$%.2f + $%.2f = %.2f%s\n", price, taxed, total, file.nextLine());
        }
        

    }
}
