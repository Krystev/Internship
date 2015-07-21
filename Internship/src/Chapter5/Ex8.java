package Chapter5;

public class Ex8 {

	public static void main(String[] args) {
		int points = 3;
		
		
		if (points > 0 && points < 4) {
			System.out.println(points *= 10);
		} else if (points > 3 && points < 7) {
			System.out.println(points *= 100);
		} else if (points > 6 && points < 10) {
			System.out.println(points *= 1000);
		} else {
			System.out.println("Wrong points, please enter point [1-9]");
		} 
		
		
	}

}
