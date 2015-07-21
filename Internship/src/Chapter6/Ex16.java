package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Random rn = new Random();
		int randomNumber = rn.nextInt(n);
		System.out.println(randomNumber);
	}

}
