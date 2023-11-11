//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner {
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(new File("spantoeng.dat"));
		int n = in.nextInt();
		in.nextLine();
		SpanishToEnglish dict = new SpanishToEnglish();
		for (int i = 0; i < n; i++) {
			dict.putEntry(in.nextLine());
		}
		out.println("====    MAP CONTENTS    ====");
		out.println(dict);

		while(in.hasNextLine()){
			out.println(dict.translate(in.nextLine()));
		}
	}
}