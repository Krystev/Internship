package Chapter13;

public class Ex3 {
	static final String OPEN_TAG = "<upcase>";
	static final String CLOSE_TAG = "</upcase>";

	public static void main(String[] args) {

		String text = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";

		while (text.contains(CLOSE_TAG)) {
			int openIndex = text.indexOf(OPEN_TAG);
			int closeIndex = text.indexOf(CLOSE_TAG);

			String substring = text.substring((openIndex + 8), closeIndex)
					.toUpperCase();
			String sub2 = text.substring(openIndex, closeIndex + 9);
			text = text.replace(sub2, substring);
		}
		System.out.println(text);
	}

}
