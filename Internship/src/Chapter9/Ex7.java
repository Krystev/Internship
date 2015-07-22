package Chapter9;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input number: ");
		int num = input.nextInt();
		System.out.println(revNums(num));

	}

	public static int revNums(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;

	}
}
