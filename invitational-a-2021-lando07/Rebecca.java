import java.io.File;
import java.util.Scanner;

public class Rebecca {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("rebecca.dat"));
        int testCases = file.nextInt();
        file.nextLine();
        for (int i = 0; i < testCases; i++) {
            int r = file.nextInt();
            int c = file.nextInt();
            int numRectangles = r*c;
            file.nextLine();
            int[][] canvas = new int[r][c];
            for (int j = 0; j < r; j++) {
                for (int e = 0; e < c; e++) {
                    canvas[j][e] = file.nextInt();
                }
            }
            

        }
    }
}