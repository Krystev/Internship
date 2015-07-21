package Chapter6;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		System.out.println("Enter k: ");
		int k = input.nextInt();
		int factorialN = 1;
		int factorialK = 1;
		int d = (n - k);
		int factorialD = 1;
		
		do {
		factorialN *= n;
		n--;
		
		} while (0 < n);
		
		do {
			factorialK *= k;
			k--;
		} while (0 < k);	
		
		do { 
			
			factorialD *= d;
			d--;
			
		} while (0 < d);
		
		long result = (factorialN * factorialK) / factorialD;
		
		System.out.println("n!*k!/(n-k)! = " + d);

	}

}
