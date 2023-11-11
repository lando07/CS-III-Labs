import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

import static java.lang.System.out;

public class Sorted {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("sorted.dat"));
        while (file.hasNextLine()) {
            SortedLinkedList deque = new SortedLinkedList();
            String[] nums = file.nextLine().split(" ");
            for (String s : nums) {
                deque.add(Integer.parseInt(s));
            }
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                str.append(deque.removeFront() + " ");
            }
            for (int i = 0; i < 5; i++) {
                str.append(deque.removeBack() + " ");
            }
            out.println(str);
        }
    }
}
