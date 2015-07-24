package Chapter13;

import java.util.Arrays;

public class Ex7 {

	public static void main(String[] args) {
		String text = "one\\two\\tree";
		
		String[] newS = text.split("\\\\");
		
		System.out.println(Arrays.toString(newS));
	}

}
