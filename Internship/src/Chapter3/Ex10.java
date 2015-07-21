package Chapter3;

public class Ex10 {

	public static void main(String[] args) {
		int abcd = 1234;
		int a = (abcd - (abcd % 1000)) / 1000;
		int b = (abcd % 1000) / 100;
		int c = (abcd % 100) / 10;
		int d = abcd % 10;
		
		int count = a + b + c + d;
		
		System.out.println(d + "" + c + "" + b + "" + a);
		System.out.println(d + "" + a + "" + b + "" + c);
		System.out.println(a + "" + c + "" + b + "" + d);
	}

}
