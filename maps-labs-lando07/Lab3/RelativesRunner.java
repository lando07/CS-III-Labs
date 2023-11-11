//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class RelativesRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("relatives.dat"));
		Relatives relatives = new Relatives();
		int runs = file.nextInt();
		file.nextLine();
		for (int i = 0; i < runs; i++) {
			relatives.setPersonRelative(file.nextLine());
		}
		out.println(relatives);
		while (file.hasNextLine()) {
			String nextLine = file.nextLine();
			if (nextLine.isEmpty())
				break;
			out.println(relatives.getRelatives(nextLine));
		}
	}
}