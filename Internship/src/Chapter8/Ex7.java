package Chapter8;

public class Ex7 {

	public static void main(String[] args) {

		String hex = "FFFF";
		System.out.println(hexToDec(hex));

	}

	public static int hexToDec(String hex) {
		int dec = 0;
		int pos = hex.length() - 1;
		int grade = 0;

		while (pos >= 0) {
			int stepNumber = hex.toCharArray()[pos] - 48;
			if (stepNumber > 9) {
				stepNumber -= 7;
			}
			dec += stepNumber * (int) Math.pow(16, grade++);
			pos--;
		}
		return dec;
	}

}
