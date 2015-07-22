package Chapter8;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {

	public static void main(String[] args) {
		String number = "1111010110011110";
		System.out.println(toHex(number));
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
	
	public static String toHex(String number) {
		Map<Integer, String> nums = new HashMap<>();

		nums.put(0, "0");
		nums.put(1, "1");
		nums.put(10, "2");
		nums.put(11, "3");
		nums.put(100, "4");
		nums.put(101, "5");
		nums.put(110, "6");
		nums.put(111, "7");
		nums.put(1000, "8");
		nums.put(1001, "9");
		nums.put(1010, "A");
		nums.put(1011, "B");
		nums.put(1100, "C");
		nums.put(1101, "D");
		nums.put(1110, "E");
		nums.put(1111, "F");

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = i * 4; j < (i * 4) + 4; j++) {
				sb.append(number.toCharArray()[j]);
			}

			String numbers = sb.toString();
			result.append(nums.get(Integer.parseInt(numbers)));
		}
		
		return result.toString();
	}

}
