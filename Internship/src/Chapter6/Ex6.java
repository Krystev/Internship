package Chapter6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter k: ");
		int k = input.nextInt();
		long factorialN = 1;
		long factorialK = 1;
		do {
		factorialN *= n;
		n--;
		factorialK *= k;
		k--;
		} while (1 < k << n);
		System.out.println("n!/k! = " + (factorialN / factorialK));
	}

}
