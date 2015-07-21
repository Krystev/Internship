package Chapter7;

public class Ex8 {

	public static void main(String[] args) {
		int[] array = { 5, 1, 2, 2, 3, 4, 5, 5, 5, 6, 2, 1, 2, 5, 5,  };

		int[] otherArray = new int[20];

		int start = 1;
		int count = 1;
		int bestCount = 0;
		int bestStart = 0;

		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				otherArray[i] = array[i];
				start = (i + 1) - count;
				count++;

				if (count > bestCount) {
					bestCount = count;
					bestStart = start;
				}
			} else {
				count = 1;
				start = i + 1;
				otherArray[i] = 0;
			}

		}

		System.out.print("Number: " + array[bestStart] + " you can find "
				+ bestCount + " times in the array!");

	}

}
