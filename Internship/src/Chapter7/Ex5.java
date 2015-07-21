package Chapter7;

public class Ex5 {

	public static void main(String[] args) {
		int[] array1 = new int[] { 1, 2, 3, 4, 2, 3, 5 };
		int[] array2 = new int[10];

		int start = 1;
		int count = 1;
		int bestCount = 0;
		int bestStart = 0;

		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i] < array1[i + 1]) {
				array2[i] = array1[i];
				start = (i + 1) - count;
				count++;

				if (count > bestCount) {
					bestCount = count;
					bestStart = start;
				}
			} else {
				count = 1;
				start = i + 1;
				array2[i] = 0;
			}
		}
		
		for(int i=bestStart;i<bestStart+bestCount;i++){
		     System.out.print(" " + array1[i]);

		   }

	}

}
