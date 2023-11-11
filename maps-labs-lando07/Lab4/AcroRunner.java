//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner {
	public static void main(String args[]) throws IOException {
		// add test cases
		Scanner file = new Scanner(new File("acro.dat"));
		Acronyms acro = new Acronyms();
		int runs = file.nextInt();
		file.nextLine();
		for (int i = 0; i < runs; i++) {
			acro.putEntry(file.nextLine());
		}
		out.println("==== MAP CONTENTS ====\n");
		out.println(acro + "\n\n==== READ LINES ====\n");
		while (file.hasNextLine()) {
			out.println(acro.convert(file.nextLine()));
		}
	}
}