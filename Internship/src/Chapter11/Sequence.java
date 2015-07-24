package Chapter11;

public class Sequence {
	private static int currentValue = -1;

	public Sequence() {
	}

	public static int nextValue() {
		currentValue++;

		return currentValue;
	}
}
