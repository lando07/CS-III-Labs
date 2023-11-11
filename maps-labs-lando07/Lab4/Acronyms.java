//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms {
	private Map<String, String> acronymTable;

	public Acronyms() {
		acronymTable = new TreeMap<>();
	}

	public void putEntry(String entry) {
		String[] strs = entry.split(" - ");
		acronymTable.put(strs[0], strs[1]);
	}

	public String convert(String sent) {
		Scanner chop = new Scanner(sent);
		String output = "";
		while (chop.hasNext()) {
			String word = chop.next();
			if (word.contains(".")) {
				word = word.substring(0, word.length() - 1);// I'm assuming the period is at the end according to the
															// input file and assignment
				output += " " + (!acronymTable.containsKey(word) ? word : acronymTable.get(word)) + ".";
			} else {
				output += " " + (!acronymTable.containsKey(word) ? word : acronymTable.get(word));
			}
		}

		return output;
	}

	public String toString() {
		return acronymTable.toString().replaceAll(", ", "\n");
	}
}