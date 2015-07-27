package Chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner fileInput = null;
		PrintStream fileOutput = null;

		try {
			fileInput = new Scanner(new File("test.txt"));
			fileOutput = new PrintStream(new File("test2.txt"));
			String line;

			while (fileInput.hasNext()) {
				line = fileInput.nextLine();
				String fixedLine = line.replace("start", "finish");
				fileOutput.println(fixedLine.toString());

			}

		} catch (FileNotFoundException fnf) {
			System.err.println(fnf.getMessage());
		} catch (NullPointerException npe) {
			System.err.println(npe.getMessage());
		} finally {
			if (fileInput != null) {
				fileInput.close();
			}
			if (fileOutput != null) {
				fileOutput.close();
			}
		}
	}

}
