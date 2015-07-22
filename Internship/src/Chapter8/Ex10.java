package Chapter8;

public class Ex10 {

	public static void main(String[] args) {
		String binNum = "111";
		int decNumber = 0;

		if (binNum == "0") {
			decNumber = 0;
		} else if (binNum == "1") {
			decNumber = 1;
		} else {
			decNumber = ((int) (binNum.toCharArray()[0] - '0') * 2)
					+ (int) (binNum.toCharArray()[1] - '0');
			for (int i = 1; i < binNum.length() - 1; i++) {
				decNumber = (decNumber * 2)
						+ (int) (binNum.toCharArray()[i + 1] - 48);
			}
		}
		
		System.out.println(decNumber);
	}

}
