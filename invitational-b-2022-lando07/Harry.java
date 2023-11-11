import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Harry {
    public static void main(String[] args) throws Exception {
        Scanner file = new Scanner(new File("harry.dat"));
        file.nextLine();
        while (file.hasNext()) {
            StringBuilder str = new StringBuilder(file.next());
            String toRemove = file.next();
            for (int i = 0; i < toRemove.length(); i++) {
                String tmp = toRemove.substring(i, i + 1);
                while (str.indexOf(tmp) != -1) {
                    str.deleteCharAt(str.indexOf(tmp));
                }
            }
            if(str.isEmpty())
                System.out.println("ALL LETTERS ARE GONE");
            else
                System.out.println(str);
        }
    }
}
