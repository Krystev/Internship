package Chapter11;

public class Ex1 {

	public static void main(String[] args) {
		int sum = 0;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {

			sum++;
		}
		long endTime = System.currentTimeMillis();
		System.out.printf(
				"The time elapsed is %f sec, %f mins, %f hours, %f days%n",
				(endTime - startTime) / 1000.0,
				(endTime - startTime) / 1000.0 * 60,
				(endTime - startTime) / 1000.0 * 60 * 60, 
				(endTime - startTime) / 1000.0 * 60 * 60 * 365);
	}

}
