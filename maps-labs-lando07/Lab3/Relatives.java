//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import static java.lang.System.*;

public class Relatives {
	private Map<String, Set<String>> map;

	public Relatives() {
		map = new TreeMap<String, Set<String>>();
	}

	public void setPersonRelative(String line) {
		if(line.equals("\n")) return;
		String[] personRelative = line.split(" ");
		String person = personRelative[0];
		String relative = personRelative[1];
		if (map.containsKey(person)) {
			map.get(person).add(relative);
		} else {
			map.put(person, new TreeSet<String>());
			map.get(person).add(relative);
		}
	}

	public String getRelatives(String person) {
		return person + " is related to " + map.get(person);
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (String s : map.keySet()) {
			str.append(s + " is related to");
			for (String st : map.get(s)) {
				str.append(" " + st);
			}
			str.append("\n");
		}
		return str.toString();
	}
}