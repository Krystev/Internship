package Chapter6;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = input.nextInt();
		int fN = 1;
		int sN = 0;
		int tN;
		for (int i = 0; i <= n; i++) {
			tN = fN + sN;
			fN = sN;
			sN = tN;
			System.out.println(tN);
		}
		
	}

}
