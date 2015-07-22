package Chapter8;

public class Ex11 {
	public static char[] rimNums = { 'i', 'v', 'x', 'l', 'c', 'd', 'm' };

	public static void main(String[] args) {
		String roman = "xi";
		int arabic = 0;

		for (int i = 0; i < roman.length(); i++) {
			if (!checkToEnd(roman, i, convertToValue(roman.toCharArray()[i]))) {
				arabic -= getValue(roman.toCharArray()[i]);
			} else {
				arabic += getValue(roman.toCharArray()[i]);
			}
		}
		System.out.println(arabic);

	}

	static int getValue(char c) {
		if (c == 'm') {
			return 1000;
		} else if (c == 'd') {
			return 500;
		} else if (c == 'c') {
			return 100;
		} else if (c == 'l') {
			return 50;
		} else if (c == 'x') {
			return 10;
		} else if (c == 'v') {
			return 5;
		} else if (c == 'i') {
			return 1;
		}
		return 0;
	}

	static boolean checkToEnd(String roman, int pos, int value) {
		for (int i = pos + 1; i < roman.length(); i++) {
			if (value < convertToValue(roman.toCharArray()[i])) {
				return false;
			}
		}
		return true;
	}

	static int convertToValue(char c) {
		for (int i = 0; i < rimNums.length; i++) {
			if (c == rimNums[i]) {
				return i;
			}
		}
		return -1;
	}

}
