package Chapter20;

public class Ex5_Cat extends Ex5_Animal {
	
	private static  int ages = 0;
	private static int count = 0;

	public Ex5_Cat(String catName, int catAge, String catSex) {

		super(catName, catAge, catSex);
		count++;
		ages += catAge;
	}

	@Override
	public void makeSound() {
		System.out.println("Miauuuu Miauuu");
		super.makeSound();
	}
	
	public static void averageAges(){
		System.out.println(ages / count);
	}

}
