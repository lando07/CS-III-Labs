import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class DryRun {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("dryrun.dat"));
        int n = file.nextInt();
        file.nextLine();
        for (int i = 0; i < n; i++) {
            String str = file.nextLine();
            out.println("I like " + str+".");
        }
    }
}
