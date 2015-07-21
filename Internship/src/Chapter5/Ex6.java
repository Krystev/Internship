package Chapter5;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 3;
		int c = 6;
		int d = 123;
		int e = 33;

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
