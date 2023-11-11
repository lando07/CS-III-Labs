import java.io.File;
import java.util.Scanner;

public class Carolyn {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("carolyn.dat"));
        file.nextLine();
        while (file.hasNext()) {
            char[] letters = file.nextLine().toCharArray();
            if (letters[0] > letters[1]) {
                // descending order
                for (int i = letters[0]; i >= letters[1]; i--) {
                    for (int e = 0; e <= letters[0] - i; e++) {
                        System.out.print((char) i);
                    }
                    System.out.println();
                }
            } else {
                for (int i = letters[0]; i <= letters[1]; i++) {
                    for (int e = 0; e <= i - letters[0]; e++) {
                        System.out.print((char) i);
                    }
                    System.out.println();
                }
            }
        }
    }
}