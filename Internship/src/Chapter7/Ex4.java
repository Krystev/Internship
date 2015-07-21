package Chapter7;

public class Ex4 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 5, 5, 6 };

		int[] otherArray = new int[10];

		int start = 1;
		int count = 1;
		int bestCount = 0;
		int bestStart = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				otherArray[i] = array[i];
				start = (i + 1) - count;
				count++;

				if (count > bestCount) {
					bestCount = count;
					bestStart = start;
				}
			} else {
				count = 1;
				start = i + 1;
				otherArray[i] = 0;
			}

		}
		
		   for(int i=bestStart;i<bestStart+bestCount;i++){
		     System.out.print(" " + array[i]);

		   }
	}

}
