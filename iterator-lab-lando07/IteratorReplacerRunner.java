//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacerRunner {
	public static void main(String[] args) {
		IteratorReplacer test = new IteratorReplacer("a b c a b c", "a", "+");
		test.replace();
		out.println(test);

		test.setList("a b c d e f g h i j x x x x", "x", "7");
		test.replace();
		out.println(test);

		test.setList("1 2 3 4 5 6 a b c a b c", "b", "#");
		test.replace();
		out.println(test);
	}
}