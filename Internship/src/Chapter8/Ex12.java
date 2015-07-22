package Chapter8;

public class Ex12 {

	public static void main(String[] args) {
		int n = 7;
		if (n < 4000 && n > 0) {
		System.out.println(toRoman(n));
		}
	}

	public static String toRoman(int arabic) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < arabic; i++) {
			while (arabic >= 1000) {
				result.append("M");
				arabic = arabic - 1000;
			}
			while (arabic >= 900) {
				result.append("CM");
				arabic = arabic - 900;
			}
			while (arabic >= 500) {
				result.append("D");
				arabic = arabic - 500;
			}
			while (arabic >= 400) {
				result.append("CD");
				arabic = arabic - 400;
			}
			while (arabic >= 100) {
				result.append("C");
				arabic = arabic - 100;
			}
			while (arabic >= 90) {
				result.append("XC");
				arabic = arabic - 90;
			}
			while (arabic >= 50) {
				result.append("L");
				arabic = arabic - 50;
			}
			while (arabic >= 40) {
				result.append("XL");
				arabic = arabic - 40;
			}

			while (arabic >= 10) {
				result.append("X");
				arabic = arabic - 10;
			}
			while (arabic >= 9) {
				result.append("IX");
				arabic = arabic - 9;
			}
			while (arabic >= 5) {
				result.append("V");
				arabic = arabic - 5;
			}
			while (arabic >= 4) {
				result.append("IV");
				arabic = arabic - 4;
			}
			while (arabic >= 1) {
				result.append("I");
				arabic = arabic - 1;
			}
		}
		return result.toString();
	}

}
