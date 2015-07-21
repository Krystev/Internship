package Chapter6;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		int x = input.nextInt();
		
		int result = 1;
		
		
		for (int i = 1; i <= n; i++) {
			result = result + (result*i) / x ^ i;
		}
		
		System.out.println(result);
	}

}
