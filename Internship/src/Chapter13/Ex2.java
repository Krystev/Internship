package Chapter13;

public class Ex2 {

	public static void main(String[] args) {

		System.out
				.println(count(
						"We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.",
						"in"));

	}

	public static int count(String text, String word) {

		int br = 0;
		word = word.toLowerCase();
		text = text.toLowerCase();
		int index = text.indexOf(word);
		while (index != -1) {
			br++;
			index = text.indexOf(word, index + 1);

		}

		return br;
	}
}
