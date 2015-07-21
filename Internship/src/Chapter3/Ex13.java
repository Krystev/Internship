package Chapter3;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		boolean isPrime = true;
		int del = 2;

		if (n < 100) {
			while (del < n) {
				if (n % del == 0) {
					isPrime = false;
					break;
				}
				del++;
			}
			if (isPrime) {
				System.out.println("Просто е");
			} else {
				System.out.println("Не е просто");
			}
		}

	}

}
