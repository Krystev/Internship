package Chapter4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextInt();
		double param = 2 * Math.PI * r;
		double round = Math.PI * (r * r);
		
		System.out.println("Parameter: " + param + " Round: " + round);
		
	}

}
