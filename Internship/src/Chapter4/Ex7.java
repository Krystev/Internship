package Chapter4;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		if (a > b && a > c && a > d && a > e) {
			System.out.println(a);
		} else if (b > a && b > c && b > d && b > e) {
			System.out.println(b);
		} else if (c > b && a < c && c > d && c > e) {
			System.out.println(c);
		} else if (d > b && d > c && a < d && d > e) {
			System.out.println(d);
		} else if (e > b && e > c && e > d && a < e) {
			System.out.println(e);
		} else {
			System.out.println(a);
		}
	}

}
