package Chapter7;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		
		char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };
		
		for (int i = 0; i < text.length(); i++) {
			for (int j = 0; j < letters.length; j++) {
				if (text.charAt(i) == letters[j]) {
					System.out.print(j + " ");
				}
			}
			
		}
	}
}
