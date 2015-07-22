package Chapter9;
import java.util.Scanner;


public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number 1: ");
		int num1 = input.nextInt();
		
		System.out.println("Please enter number 2: ");
		int num2 = input.nextInt();
		
		System.out.println("Please enter number 3: ");
		int num3 = input.nextInt();
		
		System.out.println("The biggest number is: " + getMax(num1, num2, num3));

	}
	
	public static int getMax(int a, int b){
		
		if (a > b){
			return a;
		}
		return b;
	}
	
	public static int getMax(int a, int b, int c){
		getMax(a, b);
		if ((getMax(a, b)) > c){
			return getMax(a, b);
		}
		return c;
	}

}
