package Chapter6;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = input.nextInt();
		for (int num = 0; num < n; num++){
			if (num % 21 != 0) {
				System.out.print(num + " ");
			}
		}
	}

}
