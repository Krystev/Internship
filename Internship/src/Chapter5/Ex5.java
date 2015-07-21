package Chapter5;

public class Ex5 {

	public static void main(String[] args) {
		int a, b, c, d;
		a = 1;
		b = 5;
		c = 4;

		System.out
				.println(a + "*x^2 " + "+ " + -b + " *x " + "+ " + c + " = 0");

		d = (b * b) - (4 * a * c);
		if (d > 0) {
			int x1 = (int) ((-b - Math.sqrt(d)) / 2 * a);
			int x2 = (int) ((-b + Math.sqrt(d)) / 2 * a);
			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		} else if (d == 0) {
			int x1 = (int) ((-b - Math.sqrt(d)) / a);
			System.out.println("x1 = x2 = " + x1);
		} else if (d < 0) {
			System.out.println("Уравнението няма реални корени!");

		}

	}

}
