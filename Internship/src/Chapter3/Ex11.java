package Chapter3;

public class Ex11 {

	public static void main(String[] args) {
		int n = 35; 
		int p = 6; 
		int i = 1; 
		int mask = i << p; 
		System.out.println((n & mask) != 0 ? 1 : 0); 
	}

}
