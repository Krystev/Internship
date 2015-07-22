package Chapter10;

public class Ex1 {
	
	public static void main(String[] args) {
		int n = 3;
		int[] arr = new int[n];
		PrintNumbers(arr, 0);
	}
	
	
	public static void PrintNumbers(int[] n, int iter) {
		if (iter >= n.length) {
			for (int element : n) {
				System.out.print(element + " ");
			}
			System.out.println();

		} else {
			for (int i = 1; i <= n.length; i++) {
				n[iter] = i;
				PrintNumbers(n, iter + 1);
			}
		}
	}

	
}
