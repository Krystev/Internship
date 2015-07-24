package Chapter11;

public class Ex4 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

			Cat myCats = new Cat("Cat" + Cat.getCount(), "White");
			myCats.sayMiau();
		}
	}

}
