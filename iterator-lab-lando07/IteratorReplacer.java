//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class IteratorReplacer {
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public IteratorReplacer(String line, String rem, String rep) {
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}

	public void setList(String line, String rem, String rep) {
		list = new ArrayList<String>(Arrays.asList(line.split(" ")));
		toRemove = rem;
		replaceWith = rep;
	}

	public void replace() {
		ListIterator liIt = list.listIterator();
		while (liIt.hasNext()) {
			if (liIt.next().equals(toRemove))
				liIt.set(replaceWith);
		}
	}

	public String toString() {
		return list.toString() + "\n\n";
	}
}