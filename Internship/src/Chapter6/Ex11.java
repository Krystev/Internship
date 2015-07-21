package Chapter6;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = input.nextInt();
		
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		int count = 0;
		
		System.out.println((long)result);
		while (result % 5 == 0) {
			count++;
			result = result / 5;
		}
		System.out.println(count);
	}

}
