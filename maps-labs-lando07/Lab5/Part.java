//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
import static java.lang.System.out;

public class Part implements Comparable<Part> {
	private String make, mode, rest;
	private int year;

	public Part(String line) {
		String[] list = line.split(" ");
		if (list.length == 6) {
			make = list[0] + " " + list[1];
			mode = list[2];
			rest = list[3] + " " + list[4];
			year = Integer.parseInt(list[5]);
		} else if (list.length == 5) {
			make = list[0];
			mode = list[1];
			rest = list[2] + " " + list[3];
			year = Integer.parseInt(list[4]);
		} else {
			out.println("Entry not compatible with constructor with word length " + list.length);
		}
	}

	// have to have compareTo if implements Comparable
	public int compareTo(Part rhs) {
		if (rest.compareTo(rhs.rest) != 0) {
			return rest.compareTo(rhs.rest);
		}
		if (make.compareTo(rhs.make) != 0) {
			return make.compareTo(rhs.make);
		}
		if (mode.compareTo(rhs.mode) != 0) {
			return mode.compareTo(rhs.mode);
		}
		if (year != rhs.year)
			return year - rhs.year;
		return 0;
	}

	public String toString() {
		return rest + " " + year + "  " + make + " " + mode;
	}
}