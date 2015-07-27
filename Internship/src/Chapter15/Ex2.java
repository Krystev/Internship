package Chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
	private static final String INPUT_NAMES = "names.txt";
	private static final String OUTPUT_NAMES = "alphabeticalNames.txt";
	private static ArrayList<String> LIST = new ArrayList<>();;
	
	public static void main(String[] args) {
		Scanner fileInput = null;
		PrintStream fileOutput = null;
		
		try {
			fileInput = new Scanner(new File(INPUT_NAMES), "windows-1251");
			fileOutput = new PrintStream(new File(OUTPUT_NAMES), "windows-1251");
			String line;
			
			while (fileInput.hasNext()) {
				line = fileInput.nextLine();
				add(line);
			}
			for (int i = 0; i < LIST.size(); i++) {
				fileOutput.println(LIST.get(i));
			}
			
			
		} catch (FileNotFoundException fnf) {
			System.err.println(fnf.getMessage());
		} catch (UnsupportedEncodingException uee) {
			System.err.println(uee.getMessage());
		} finally {
			if (fileInput != null) {
				fileInput.close();
			}
			if (fileOutput != null) {
				fileOutput.close();
			}
		}
	}
	
	
	private static void add(String line) {
		
		LIST.add(line);
		Collections.sort(LIST);
	}

}
