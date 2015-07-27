package Chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		String fileName = "sample1.txt";
		Scanner fileReader = null;
		int line = 0;

		try {
			fileReader = new Scanner(new File(fileName), "UTF-8");

			while (fileReader.hasNext()) {
				line++;
				String nextLine = fileReader.nextLine();
				if (line % 2 != 0) {
					System.out.println(nextLine);
				}
			}

		} catch (FileNotFoundException fnf) {
			System.err.println(fnf.getMessage());
		} catch (NullPointerException npe) {
			System.err.println(npe.getMessage());
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}

		}

	}

}
