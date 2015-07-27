package Chapter20;

public class Ex5_Dog extends Ex5_Animal{
	public static int count = 0;
	private static int ages = 0;

	public Ex5_Dog(String dogName, int dogAge, String dogSex) {
		super(dogName, dogAge, dogSex);
		count++;
		ages += dogAge;
	}
	
	@Override
	public void makeSound() {
		System.out.println("Bau Bau");
		super.makeSound();
	}
	
	public static void averageAges(){
		System.out.println(ages / count);
	}

}
