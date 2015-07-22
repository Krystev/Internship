package Chapter9;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please Select Option: 1 - Reverse the number, 2 - Avarage values of all numbers, 3 - Equation a * x + b = 0");
		switch (sc.nextInt()) {
		case 1:System.out.println(reverse(sc.nextInt())); ;break;
		case 2:System.out.println(count(sc.nextInt(), sc.nextInt(), sc.nextInt()));break;
		case 3:System.out.println(equation(sc.nextInt(), sc.nextInt()));break;
		
		default:System.out.println("Wrong number!");break;
		}
	}

	public static int reverse(int n) {
		String num = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		if (n > 0) {
			for (int i = 0; i < num.length(); i++) {
				sb.append(num.charAt(num.length() - 1 - i));
			}
		}

		return Integer.parseInt(sb.toString());
	}

	public static int count(int... line) {
		int count = 0;
		if (line.length != 0) {
			for (int i = 0; i < line.length; i++) {
				count += line[i];
			}
			count = count / (line.length - 1);
		}
		return count;
	}

	public static double equation(int a, int b) {
		double result = 0;
		if (a != 0) {
			result = -b / a;
		}
		return result;
	}

}
