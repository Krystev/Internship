package Chapter7;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		char[] arr1 = { 'a', 'b', 'd' };
		char[] arr2 = { 'a', 'b', 'd', 'e' };

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				if (arr1[i] > arr2[i]) {
					System.out.println(Arrays.toString(arr2));
					break;
				} else if (arr2[i] > arr1[i]) {
					System.out.println(Arrays.toString(arr1));
					break;
				}
			}
		}
		if (arr1.length < arr2.length) {
			System.out.println(Arrays.toString(arr1));
		} else if (arr2.length < arr1.length) {
			System.out.println(Arrays.toString(arr2));
		} else {
			System.out.println("Arrays are the same!");
		}

	}

}
