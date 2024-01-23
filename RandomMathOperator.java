package assignment.Day1;

import java.util.Random;

public class RandomMathOperator {

	public static void main(String[] args) {
		Random random = new Random();

		int num1 = random.nextInt(10) + 1;
		int num2 = random.nextInt(10) + 1;

		char operator = 0;
		int operatorCode = random.nextInt(4);// 0,1,2,3

		switch (operatorCode) {
		case 0:
			operator = '+';
			break;
		case 1:
			operator = '-';
			break;
		case 2:
			operator = '*';
			break;
		case 3:
			operator = '/';
			break;
		}

		int result = 0;
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
			if (num2 != 0) {
				result = num1 + num2;
			} else {
				System.out.println("error!! cannot divide by zero");
			}

		}
		System.out.println(num1+" "+operator+" "+num2+ " = "+result);

	}

}
