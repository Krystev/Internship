package Chapter20;

public class Ex5_Frog extends Ex5_Animal {
	
	private static int ages = 0;
	private static int count = 0;

	public Ex5_Frog(String frogName, int frogAge, String frogSex) {
		super(frogName, frogAge, frogSex);
		count++;
		ages += frogAge;
	}

	@Override
	public void makeSound() {
		System.out.println("Kwak Kwak");
		super.makeSound();
	}
	
	public static void averageAges(){
		System.out.println(ages / count);
	}

}
