//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Histogram {
	private Map<String, Integer> histogram;

	public Histogram() {
		histogram = new TreeMap<String, Integer>();
	}

	public Histogram(String sent) {
		histogram = new TreeMap<String, Integer>();
		String[] chars = sent.split(" ");
		for (String s : chars) {
			if (histogram.containsKey(s)) {
				histogram.put(s, histogram.get(s) + 1);
			} else {
				histogram.put(s, 1);
			}
		}
	}

	public void setSentence() {
	}

	public String toString() {
		StringBuilder output = new StringBuilder("char\t1---5----01---5\n");
		for (String s : histogram.keySet()) {
			output.append(s + "\t");
			for (int i = 0; i < histogram.get(s); i++) {
				output.append("*");
			}
			output.append("\n");
		}
		return output.toString();
	}
}