package Chapter9;

public class Ex6 {
public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 3, 2, 11};
		System.out.println(position(arr));
	}

	public static int position(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (isBigger(array, i)) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isBigger(int[] arr, int index){
		
		if(index == 0){
			if(arr[index] < arr[index + 1]){
				return false;
			}
		}
		
		if(index == (arr.length - 1)){
			if( arr[index - 1] > arr[index]){
				return false;
			}
			return true;
		}
		
		if ((arr[index] < arr[index - 1]) || (arr[index] < arr[index + 1])){
				return false;
		}
		
		return true;
	}

}
