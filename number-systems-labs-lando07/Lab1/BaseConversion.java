//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class BaseConversion {
	private String number;
	private int base;

	public BaseConversion(String num, int b) {
		number = num;
		base = b;
	}

	public void setNumBase(String num, int b) {
		number = num;
		base = b;
	}

	private int convertToTen() {
		int q = number.length();
		int base10 = 0;
		for (int i = q - 1; i > -1; i--) {
			int pow = q - i - 1;
			if (number.charAt(i) > '9') {
				base10 += Math.pow(base, pow) * (number.charAt(i) - 'A' + 10);
			} else {
				base10 += Math.pow(base, pow) * (number.charAt(i) - '0');
			}
		}
		return base10;
	}

	public String getNum(int newBase) {
		int base10 = convertToTen();
		String newNum = "";
		while (base10 > 0) {
			int remainder = base10 % newBase;
			if (remainder > 9) {
				newNum = (char) (remainder - 10 + 'A') + newNum;
			} else
				newNum = remainder + newNum;
			base10 /= newBase;
		}
		return newNum + "-" + newBase;
	}

	public String toString() {
		return number + "-" + base;
	}
}