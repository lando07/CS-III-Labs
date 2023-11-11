import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class LineSimulator {

    public static void singleLineSim(int numCustomers) {

        int time = 1;
        Queue<Integer> line = new LinkedList<>();
        line.add(1);
        int currCustomer = 2;
        /*
         * New customer every 5 ticks
         * Central queue
         * cashier 1 - every 12 ticks
         * cashier 2 - every 19 ticks
         * cashier 3 - every 25 ticks
         *
         * How long does it take to check out
         * all customers?
         */
        while (currCustomer <= numCustomers || !line.isEmpty()) {
            if (time % 5 == 0 && currCustomer <= numCustomers) {
                line.add(currCustomer);
                currCustomer++;
            }
            if (time % 12 == 0 && !line.isEmpty()) {
                out.println("Cashier 1 served customer " + line.remove());
            }
            if (time % 19 == 0 && !line.isEmpty()) {
                out.println("Cashier 2 served customer " + line.remove());
            }
            if (time % 25 == 0 && !line.isEmpty()) {
                out.println("Cashier 3 served customer " + line.remove());
            }
            time++;
        }
        out.println("It took a total of " + time + " ticks to serve all customers with a single line.");

    }

    public static void threeLineSim(int numCustomers) {

        int time = 1;
        int currCustomer = 2;
        Queue<Integer> cashier1 = new LinkedList<>();
        Queue<Integer> cashier2 = new LinkedList<>();
        Queue<Integer> cashier3 = new LinkedList<>();
        cashier1.add(1);
        /*
         * New customer every 5 ticks
         * 3 Individual lines
         * Customer always chooses the shortest
         * line (checking cashier 1, then 2, then 3)
         * cashier 1 - every 12 ticks
         * cashier 2 - every 19 ticks
         * cashier 3 - every 25 ticks
         *
         * How long does it take to check out
         * all customers?
         */
        while (currCustomer <= numCustomers || !cashier1.isEmpty() || !cashier2.isEmpty() || !cashier3.isEmpty()) {
            if (time % 5 == 0 && currCustomer <= numCustomers) {
                int smallestQ = Math.min(cashier1.size(), Math.min(cashier2.size(), cashier3.size()));
                if (smallestQ == cashier1.size()) {
                    cashier1.add(currCustomer);
                    currCustomer++;
                } else if (smallestQ == cashier2.size()) {
                    cashier2.add(currCustomer);
                    currCustomer++;
                } else if (smallestQ == cashier3.size()) {
                    cashier3.add(currCustomer);
                    currCustomer++;
                }
            }
            if (time % 12 == 0 && !cashier1.isEmpty()) {
                out.println("Cashier 1 served customer " + cashier1.remove());
            }
            if (time % 19 == 0 && !cashier2.isEmpty()) {
                out.println("Cashier 2 served customer " + cashier2.remove());
            }
            if (time % 25 == 0 && !cashier3.isEmpty()) {
                out.println("Cashier 3 served customer " + cashier3.remove());
            }
            time++;
        }
        out.println("It took a total of " + time + " ticks to serve all customers with three separate lines.");
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(in);

        System.out.print("How many customers do you want to simulate? ");
        int totalCustomers = kbd.nextInt();

        singleLineSim(totalCustomers);
        threeLineSim(totalCustomers);

    }
}
