import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import static java.lang.System.out;

public class InToPost {

	String infix;

	public InToPost() {
		infix = "";
	}

	public InToPost(String exp) {
		infix = exp;
	}

	public void setInfix(String exp) {
		infix = exp;
	}

	public String convert() {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> operators = new Stack<>();

		// Define operator precedence
		int precedence = 0;
		boolean isOperandPending = false; // To handle multi-digit numbers

		for (char c : infix.toCharArray()) {
			if (Character.isDigit(c) || c == '.') {
				// Operand, append to the postfix expression
				postfix.append(c);
				isOperandPending = true;
			} else {
				if (isOperandPending) {
					postfix.append(" "); // Separate multi-digit numbers with a space
					isOperandPending = false;
				}
				if (c == '(') {
					// Left parenthesis, push onto the operator stack
					operators.push(c);
				} else if (c == ')') {
					// Right parenthesis, pop operators and append to postfix until a left
					// parenthesis is encountered
					while (operators.peek() != '(') {
						postfix.append(operators.pop()).append(" ");
					}
					operators.pop();
				} else if (c == ' ') {
					continue;
				} else {
					// Operator
					while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
						postfix.append(operators.pop()).append(" ");
					}
					operators.push(c);
				}
			}
		}
		if (postfix.charAt(postfix.length() - 1) != ' ')
			postfix.append(' ');
		while (!operators.isEmpty()) {
			if (operators.peek() == '(') {
				return "Invalid expression";
			}
			postfix.append(operators.pop()).append(" ");
		}

		return postfix.toString().trim(); // Trim to remove any trailing space
	}

	private static int precedence(char operator) {
		switch (operator) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
		}
		return -1; // Default precedence for other characters
	}

	@Override
	public String toString() {
		return convert();
	}
}
