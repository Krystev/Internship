package Chapter4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for (int i = a; i <= b; i++) {
			if (i % 5 == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
