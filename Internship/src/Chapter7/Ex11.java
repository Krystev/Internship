package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Insert matrix NxM: ");

		int n = input.nextInt();
		int m = input.nextInt();

		int[][] array = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("Matrix [%d][%d] = ", i, j);
				array[i][j] = input.nextInt();
			}
		}
		int bestrow = 0;
		int bestsum = Integer.MIN_VALUE;
		int bestcol = 0;

		System.out.printf("Your matrix is: \n");
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + "  ");
			}
		}
		for (int row = 0; row < array.length - 2; row++) {
			for (int col = 0; col < array[0].length - 2; col++) {
				int sum = array[bestrow][bestcol] + array[bestrow][bestcol + 1]
						+ array[bestrow][bestcol + 2]
						+ array[bestrow + 1][bestcol]
						+ array[bestrow + 1][bestcol + 1]
						+ array[bestrow + 1][bestcol + 2]
						+ array[bestrow + 2][bestcol]
						+ array[bestrow + 2][bestcol + 1]
						+ array[bestrow + 2][bestcol + 2];
				if (sum > bestsum) {
					bestrow = row;
					bestcol = col;
					bestsum = sum;
				}
			}
		}

		System.out.println();
		System.out.println("Best platform is: ");

		System.out.printf("%d %d %d\n", array[bestrow][bestcol],
				array[bestrow][bestcol + 1], array[bestrow][bestcol + 2]);
		System.out.printf("%d %d %d\n", array[bestrow + 1][bestcol],
				array[bestrow + 1][bestcol + 1],
				array[bestrow + 1][bestcol + 2]);
		System.out.printf("%d %d %d\n", array[bestrow + 2][bestcol],
				array[bestrow + 2][bestcol + 1],
				array[bestrow + 2][bestcol + 2]);

		System.out.printf("The maximum sum is: %d", bestsum);
	}

}
