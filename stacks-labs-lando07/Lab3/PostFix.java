//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix {
	private Stack<Double> numberStack;
	private String expression;

	public PostFix() {
		numberStack = new Stack<>();
		expression = "";
	}

	public PostFix(String exp) {
		numberStack = new Stack<>();
		expression = exp;
	}

	public void setExpression(String exp) {
		expression = exp;
	}

	public double calc(double one, double two, char op) {
		switch (op) {
			case '-':
				return one - two;
			case '+':
				return one + two;
			case '/':
				return one / two;
			case '*':
				return one * two;
			default:
				throw new UnsupportedOperationException("Unsupported operator: " + op);
		}
	}

	public void solve() {
		Scanner sc = new Scanner(expression);
		while(sc.hasNext()){
			String operatorand = sc.next();
			try{
				double d = Double.parseDouble(operatorand);
				numberStack.push(d);
			}
			catch(NumberFormatException nfe){
				double two = numberStack.pop();
				double one = numberStack.pop();
				numberStack.push(calc(one, two, operatorand.charAt(0)));
			}
		}
	}

	@Override
	public String toString(){
		solve();
		return expression + " = " + numberStack.pop();
	}
}