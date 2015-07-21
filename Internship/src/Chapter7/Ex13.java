package Chapter7;

import java.util.Arrays;

public class Ex13 {

	public static void main(String[] args) {

		int n = 69;
		int[] array = { 3, 4, 324, 234, 2, 34, 84, 59, 69, 71, 82 };

		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

		int lo = 0;
		int hi = array.length - 1;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (n < array[mid]) {
				hi = mid - 1;
			} else if (n > array[mid]) {
				lo = mid + 1;
			} else {
				System.out.println("Number " + n + " is with index " + mid
						+ " in the array!");
				break;
			}

		}
		
	}

}
