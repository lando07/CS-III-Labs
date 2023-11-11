//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class HistogramRunner {
	public static void main(String args[]) throws IOException {
		Scanner file = new Scanner(new File("histogram.dat"));
		while (file.hasNextLine()) {
			out.println(new Histogram(file.nextLine()).toString());
			out.println();
			out.println();
		}
	}
}