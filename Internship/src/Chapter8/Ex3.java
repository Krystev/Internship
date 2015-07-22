package Chapter8;

public class Ex3 {

	public static void main(String[] args) {

		String[] hexNumber = {"2A3E", "FA", "FFFF", "5A0E9"};
		
		for (int i = 0; i < hexNumber.length; i++) {
			int decimal = Integer.parseInt(hexNumber[i], 16);
			System.out.println(hexNumber[i] + " to Decimal ->" + decimal);
			
			String binNumber = Integer.toBinaryString(Integer.parseInt(hexNumber[i], 16));
			System.out.println(hexNumber[i] + " to Binary ->" + binNumber);
		}
		
		
		
	}

}
