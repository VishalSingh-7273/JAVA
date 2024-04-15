
/*Implement a command-line calculator that takes arithmetic expressions as command-line arguments and evaluates them.Support basic arithmetic operations like addition, subtraction, multiplication, and ivision. For example: java Calculator 5 + 3 */
import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Usage: java Calculator <num1> <operator> <num2>");
			return;
		}

		double num1, num2;
		try {
			num1 = Double.parseDouble(args[0]);
			num2 = Double.parseDouble(args[2]);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format");
			return;
		}

		char operator = args[1].charAt(0);

		double result;
		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 == 0) {
					System.out.println("Cannot divide by zero");
					return;
				}
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid operator. Supported operators are +, -, *, and /.");
				return;
		}

		System.out.println("Result: " + result);
	}
}
