package Chapter14;

public class Ex17 {

	public static void main(String[] args) {
		Ex8_To_Ex16 samsung = new Ex8_To_Ex16("Samsung", new Ex8_Display(10, 12,
				16000000));

		samsung.addCall();
		samsung.addCall();
		samsung.addCall();
		samsung.addCall();

		for (int i = 0; i < samsung.getCallHistory().size(); i++) {
			System.out.println(samsung.getCallHistory().get(i));
		}

		System.out.println(samsung.callPrice(0.37));

		samsung.removeAll();

	}

}
