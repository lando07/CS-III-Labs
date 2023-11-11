import static java.lang.System.out;
import java.io.File;
import java.util.Scanner;

public class Eva {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("eva.dat"));
        int j = 1;
        int N = file.nextInt();
        N = 2;//for testing remove when done
        while (N-- > 0) {
            out.println("Start of triangle #" + j);
            int num = file.nextInt();
            file.nextLine();
            for (int r = 0; r < num; r++) {
                for(int s = num - 1; s > 0; s--){
                    out.print(" ");
                }
                out.print("*");
            }
            out.println();
        }
        out.println("End of triangle #" + j++);
    }
}
