//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class Number implements Comparable<Number> {
	// add in instance variables
	String binary;
	String origNum;
	int base10;
	int base;
	int num1s;

	// add in a constructor or two
	public Number(String num, int base) {
		origNum = num;
		base10 = Integer.parseInt(num, base);
		binary = Integer.toBinaryString(base10);
		for (char c : binary.toCharArray()) {
			if (c == '1') {
				num1s++;
			}
		}
	}

	public int compareTo(Number param) {
		if (num1s != param.num1s)
			return num1s - param.num1s;
		else if (base10 != param.base10) {
			return base10 - param.base10;
		}
		return origNum.compareTo(param.origNum);
	}

	public String toString() {
		return origNum + ' ' + base10 + ' ' + binary;
	}
}