package Chapter14;

public class Ex12 {

	public static void main(String[] args) {
		Ex8_To_Ex16 samsung = new Ex8_To_Ex16("Samsung", new Ex8_Display(12, 10,
				16000000));
		System.out.println(samsung.getDisplay().getDisplaySize());

		Ex8_To_Ex16[] array = new Ex8_To_Ex16[5];
		array[0] = new Ex8_To_Ex16("Samsung", new Ex8_Display(12, 10, 16000000));
		array[1] = new Ex8_To_Ex16("Nokia", new Ex8_Display(12, 10, 16000000));
		array[2] = new Ex8_To_Ex16("IPhone", new Ex8_Display(12, 10, 16000000));
		array[3] = new Ex8_To_Ex16("LG", new Ex8_Display(12, 10, 16000000));
		array[4] = new Ex8_To_Ex16("HTC", new Ex8_Display(12, 10, 16000000));

		Ex8_To_Ex16.nokiaN95Info();

	}

}
