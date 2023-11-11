//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemoverRunner {
	public static void main(String[] args) {
		IteratorRemover test = new IteratorRemover("a b c a b c", "a");
		test.remove();
		out.println(test);

		test.setList("a b c d e f g h i j x x x x", "x");
		test.remove();
		out.println(test);

		test.setList("1 2 3 4 5 6 a b c a b c", "b");
		test.remove();
		out.println(test);
	}
}