package Chapter7;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = { 3, 32, 43, 1, 5, 3, 4, 21, 5 };
		int start = 0;
		int end = 0;
		int currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum = 0;
			for (int j = i; j >= 0; j--) {
				currentSum += arr[j];
				if (currentSum == n) {
					start = j;
					end = i + 1; 
				}
			}
		}
		
		if (end == 0) {
			System.out.println("There is no sequence of given sum!");
		}

		for (int i = start; i < end; i++) {
			System.out.print (arr[i] + " ");
		}
	}

}
