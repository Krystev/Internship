package Chapter9;

public class Ex4 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 8, 14, 29, 30, 2, 2};
		System.out.println(numRepeat(arr, 2));
		
	}
	
	public static int numRepeat(int[] arr, int num){
		
		int repeat = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == num){
				repeat++;
			}
		}
		
		return repeat;
	}
}
