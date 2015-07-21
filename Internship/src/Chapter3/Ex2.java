package Chapter3;

public class Ex2 {

	public static void main(String[] args) {
		int a = 35;
		boolean isEven = (a % 5 == 0 && a % 7 == 0) ? true : false;
		
		System.out.println(isEven);
	}

}
