//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker {
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker() {
		exp = "";
		symbols = new Stack<>();
	}

	public SyntaxChecker(String s) {
		exp = s;
		symbols = new Stack<>();
	}

	public void setExpression(String s) {
		exp = s;
	}

	public boolean checkExpression() {
		symbols = new Stack<>();
		if (exp.length() < 2)
			return false;
		char[] expChr = exp.toCharArray();
		Map<Character, Character> symbolMap = new HashMap<Character, Character>();
		symbolMap.put('(', ')');
		symbolMap.put('{', '}');
		symbolMap.put('[', ']');
		symbolMap.put('<', '>');
		for (char c : expChr) {
			if (symbolMap.keySet().contains(c)) {
				symbols.push(c);
			} else if (symbolMap.values().contains(c)) {// if it is a close symbol
				if (symbols.isEmpty())
					return false;
				char k = symbolMap.get(symbols.pop());
				if (k != c)
					return false;
			}
		}
		return symbols.isEmpty();

	}

	@Override
	public String toString() {
		return exp + " is " + (checkExpression() ? "correct." : "incorrect.") + '\n';
	}
}