//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Convert {
	private String sentence;
	private String binary;

	public Convert() {
		sentence = "";
		binary = "";
	}

	public Convert(String sentence) {
		this.sentence = sentence;
		binary = "";
	}

	public void convert() {
		int i = 0;
		for (char c : sentence.toCharArray()) {
			if (c == ' ')
				binary += '0';
			binary += '0' + Integer.toBinaryString(c) + ' ';
			i++;
			if (i == 7) {
				binary += '\n';
				i = 0;
			}
		}
	}

	public String toString() {
		return sentence + '\n' + binary + '\n' + '\n';
	}
}