package Chapter8;

public class Ex8 {

	public static void main(String[] args) {
		String hex = "EF";

		int[] bin = new int[4 * hex.length()];
		int[] rev = new int[bin.length];

		bin = hexToBin(hex);
		for (int i = 0; i < bin.length; i++) {
			rev[i] = bin[bin.length - 1 - i];
		}
		for (int i : rev) {
			System.out.print(i);
		}
	}

	public static int[] hexToBin(String hex) {
		int dec = 0;
		int count = hex.length() - 1;
		int[] result = new int[hex.length() * 4];
		int grade = 0;

		while (count >= 0) {
			int stepNumber = hex.toCharArray()[count] - 48;

			if (stepNumber > 9) {
				stepNumber -= 7;
			}
			dec = stepNumber;
			int step = 4 * grade;

			for (int i = 0; i < 4; i++) {
				result[step] = dec % 2;
				dec /= 2;
				step++;
			}

			count--;
			grade++;
		}

		return result;
	}

}
