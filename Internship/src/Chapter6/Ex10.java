package Chapter6;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = input.nextInt();
		int j = n;
		for (int row = 1; row <= n; row++) {
			if (n > 20) {
				System.out.println("Твърде голямо число");
				break;
			}

			for (int col = row; col <= j; col++) {
				System.out.print(col + " ");

			}
			System.out.println();
			j++;

		}
	}

}
