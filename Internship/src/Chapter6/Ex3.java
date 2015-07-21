package Chapter6;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int smallest = 0, largest = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("enter the number of numbers:");
		int number = input.nextInt();

		System.out.println("enter a few numbers:");
		for (int i = 0; i < number; i++) {
			int n = input.nextInt();
			if (i == 0) {
				smallest = n;
				largest = n;
			}
			if (n < smallest) {
				smallest = n;
			}
			if (n > largest) {

				largest = n;
			}
		}

		System.out.println("\n" + "Smallest: " + smallest);
		System.out.println("Largest: " + largest);
	}

}
