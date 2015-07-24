package Chapter13;

public class Ex6 {

	public static void main(String[] args) {
		String text = "C# is not C++ and PHP is not Delphi";
		String[] array = text.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[array.length - i - 1]).append(" ");
		}

		text = sb.toString();
		System.out.println(text);

	}

}
