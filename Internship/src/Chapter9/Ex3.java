package Chapter9;

public class Ex3 {
	
	public static void main(String[] args) {
		
		System.out.println(lastDigit(12456));
	}
	
	public static String lastDigit(int Number){
		byte last = (byte) (Number % 10);
		switch (last) {
		case 1: return "One";
		case 2: return "Two";
		case 3: return "Tree";
		case 4: return "Four";
		case 5: return "Dive";
		case 6: return "Six";
		case 7: return "Seven";
		case 8: return "Eight";
		case 9: return "Nine";
		case 0: return "Zero";
		}
		return "Error";
	}
}
