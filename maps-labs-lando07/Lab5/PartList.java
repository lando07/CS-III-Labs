//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class PartList {
	private TreeMap<Part, Integer> partsMap;

	public PartList() {
		partsMap = new TreeMap<>();
	}

	public PartList(String fileName) {
		this();
		try {
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()) {
				String entry = file.nextLine();
				if(entry.isEmpty()) break;
				Part part = new Part(entry);
				if (partsMap.containsKey(part)) {
					partsMap.put(part, partsMap.get(part) + 1);
				} else {
					partsMap.put(part, 1);
				}
			}

		} catch (IOException e) // Most specific exceptions must be listed 1st
		{
			out.println(e);
		} catch (RuntimeException e) {
			out.println(e);
		} catch (Exception e) {
			out.println(e);
		} finally {
			// no code needed here
		}
	}

	public String toString() {
		StringBuilder output = new StringBuilder();
		for (Part p : partsMap.keySet()) {
			output.append(p.toString() + " - " + partsMap.get(p) + "\n");
		}
		return output.toString();
	}
}