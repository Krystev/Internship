package Chapter9;

public class Ex8 {
	public static void main(String[] args) {

		factorial();
	}

	public static void factorial() {
		
		long fact = 1L;
		for (int i = 2; i < 100; i++) {
			fact = i * fact;
			System.out.println(fact);
		}

	}
}
