package Chapter13;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter some text for reverse: ");
		System.out.println(reversed(input.nextLine()));
	}
	
	public static String reversed(String text){
		
		String reverse = new StringBuffer(text).reverse().toString();
		return reverse;
	}

}
