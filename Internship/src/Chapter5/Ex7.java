package Chapter5;

public class Ex7 {

	public static void main(String[] args) {
		int a = 1;
		int b = (-1);
		int c = 12;
		int d = 10;
		
		if (Math.abs(a) - Math.abs(b) == 0 ) {
			System.out.println(a + " " + b);
		} else if (Math.abs(a) - Math.abs(c) == 0) {
			System.out.println(a + " " + c);
		} else if (Math.abs(a) - Math.abs(d) == 0) {
			System.out.println(a + " " + d);
		} else if (Math.abs(b) - Math.abs(c) == 0) {
			System.out.println(b + " " + c);
		}else if (Math.abs(b) - Math.abs(d) == 0) {
			System.out.println(b + " " + d);
		} else {
			System.out.println(c + " " + d);
		}
		
	}

}
