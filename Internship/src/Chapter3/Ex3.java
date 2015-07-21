package Chapter3;

public class Ex3 {

	public static void main(String[] args) {
		int a = 4783;
		
		boolean isSevenOnThird = (((a % 1000) - (a % 100)) / 100 == 7) ? true : false;
		System.out.println(isSevenOnThird);
	}

}
