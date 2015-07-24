package Chapter13;

public class Ex4 {

	public static void main(String[] args) {
		String forbidden = "Java,JVM,Microsoft";
		String[] arr = forbidden.split(",");

		String text = "Microsoft announced its next generation Java compiler today. It uses advanced parser and special optimizer for the Microsoft JVM.";
		for (String forbiddenWord : arr) {
			String censored = "";
			for (int i = 0; i < forbiddenWord.length(); i++) {
				censored += "*";
			}

			text = text.replace(forbiddenWord, censored);
		}

		System.out.println(text);
	}

}
