//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class StackTest {
	private Stack<String> stack;

	public StackTest() {
		stack = new Stack<>();
		setStack("");
	}

	public StackTest(String line) {
		stack = new Stack<>();
		setStack(line);
	}

	public void setStack(String line) {
		String[] arr = line.split(" ");
		for (String s : arr)
			stack.push(s);
	}

	public void popEmAll() {
		StringBuilder popped = new StringBuilder();
		while (!stack.empty()) {
			popped.append(stack.pop() + " ");
		}
		out.println("popping all items from the stack" + "\n" + popped + "\n\n\n");
	}

	@Override
	public String toString() {
		return stack.toString() + '\n';
	}
}