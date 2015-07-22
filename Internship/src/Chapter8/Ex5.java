package Chapter8;

public class Ex5 {

	public static void main(String[] args) {
		String number = "1111010110011110";
		
		System.out.println(toDec(number));
	}
	
	public static int toDec(String number) {
		int grade = 0;
		int result = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			result += ((int) number.toCharArray()[i] - 48)
					* (int) Math.pow(2, grade++);
		}
		return result;
	}

}
