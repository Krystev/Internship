package Chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner readLine = null;
		PrintStream outputResult = null;

		int[][] squareMatrix;
		int bestSum = Integer.MIN_VALUE;

		try {
			readLine = new Scanner(new File("matrix.txt"));
			outputResult = new PrintStream(new File("matrix2.txt"));

			int size = 4;

			squareMatrix = new int[size][size];

			for (int i = 0; i < size; i++) {
				String firstLine = readLine.nextLine();
				String[] elements = firstLine.split(" ");

				for (int j = 0; j < size; j++) {
					squareMatrix[i][j] = Integer.parseInt(elements[j]);
				}
			}

			for (int row = 0; row < squareMatrix.length - 1; row++) {
				for (int col = 0; col < squareMatrix.length - 1; col++) {
					int sum = squareMatrix[row][col]
							+ squareMatrix[row][col + 1]
							+ squareMatrix[row + 1][col]
							+ squareMatrix[row + 1][col + 1];

					if (bestSum < sum) {
						bestSum = sum;
					}
				}

			}

		} catch (FileNotFoundException fnf) {

			System.err.println(fnf.getMessage());

		} catch (NullPointerException npe) {

			System.err.println(npe.getMessage());

		} finally {
			if (readLine != null) {
				readLine.close();
			}

			if (outputResult != null) {
				outputResult.close();
			}

			outputResult.println(bestSum);
		}
	}
}
