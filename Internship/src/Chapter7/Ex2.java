package Chapter7;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter numbers of elements in array 1: ");
		int[] array1 = new int[input.nextInt()];
		int n1 = 0;
		int n2 = 0;

		System.out.println("Please Enter Elements in Array 1: ");
		for (int i = 0; i < array1.length; i++) {

			array1[i] = input.nextInt();
		}

		n1 = array1.length - 1;

		System.out.println("Please enter numbers of elements in array 2: ");
		int[] array2 = new int[input.nextInt()];

		System.out.println("Please Enter Elements in Array 2: ");
		for (int k = 0; k < array2.length; k++) {

			array2[k] = input.nextInt();
			n2 = array2.length - 1;
		}

		if (n1 != n2) {
			System.out.println("Arrays are different!");
		} else {
			for (int l = 0; l < array2.length; l++) {
				if (array1[l] != array2[l]) {
					System.out.println("Arrays are different!");
				} else {
					System.out.println("Arrays are the same!");
					break;
				}
			}
		}
	}

}
