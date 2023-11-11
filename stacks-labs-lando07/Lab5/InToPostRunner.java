import static java.lang.System.*;

import java.util.Scanner;

public class InToPostRunner {
	public static void main(String[] args) {
		Scanner console = new Scanner(in);
		String answer = "";
		do{
			out.println("Enter an infix expression(aka the normal equations you do in math) or quit to exit");
			out.print(">>> ");
			answer = console.nextLine();
			if(!answer.equals("quit")){
				InToPost converter = new InToPost(answer);
				out.println("Here's the postfix expression:");
				out.println(converter);
			}
		}while(answer.equals("quit"));
	}
}
