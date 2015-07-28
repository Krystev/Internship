package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		String path = "names.txt";
		System.out.println(getContent(path));
	}

	private static String getContent(String path) {
		
		StringBuilder content= new StringBuilder();
		Scanner readFile = null;
		
		try {
			
			readFile = new Scanner(new File(path));
			while (readFile.hasNextLine()) {
				content.append(readFile.nextLine()).append("\n");
			}

		} catch (NullPointerException npe) {
			System.out.println("Please enter some data!");
			
		} catch (FileNotFoundException fnf) {
			
			System.out.printf("This file: %s is not found!", path);
			
		} finally {
			
			if (readFile != null) {
				readFile.close();
			}
		}

		return content.toString();
	}

}
