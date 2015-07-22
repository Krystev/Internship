package Chapter9;

public class Ex5 {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 3, 2, 11 };
		System.out.println("Is 5 element bigger than other around it: "
				+ isBigger(arr, 5));
	}

	public static boolean isBigger(int[] arr, int index) {

		if (index == 0) {
			if (arr[index] < arr[index + 1]) {
				return false;
			}
		}

		if (index == (arr.length - 1)) {
			if (arr[index - 1] > arr[index]) {
				return false;
			}
			return true;
		}

		if ((arr[index] < arr[index - 1]) || (arr[index] < arr[index + 1])) {
			return false;
		}

		return true;
	}

}
