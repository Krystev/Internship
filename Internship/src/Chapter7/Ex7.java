package Chapter7;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		int[] num = new int[] { 23, 5, 356, 23, 1235, 2, 5346, 36, 2, 23, 423,
				4 };
		int first, temp;
		for (int i = num.length - 1; i > 0; i--) {
			first = 0;
			for (int j = 1; j <= i; j++) {
				if (num[j] < num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
		
		System.out.println(Arrays.toString(num));

	}

}
