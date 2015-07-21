package Chapter6;

public class Ex12 {

	public static void main(String[] args) {
		int n = 93;
		
		int count;
		
		StringBuilder finalCount = new StringBuilder();
		while (n != 0) {
			count = n % 2; 
			n = n/2;
			
			finalCount.append(count);
		}
		
		
		System.out.print(finalCount.reverse());
		
	}

}
