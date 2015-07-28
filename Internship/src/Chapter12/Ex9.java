package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputFile = "\\WorkSpace\\Internship\\names.txt";
		String outputFile = "names2.txt";

		String fileContent = ReadFile(inputFile);
		byte[] byteArray = BinaryToByteArray(fileContent);
		WriteFile(outputFile, byteArray);

		sc.close();
	}

	static String ReadFile(String fileName) {
		String errorMessage = null;
		StringBuilder binaryStr = new StringBuilder();
		Scanner readFile = null;
		try {
			readFile = new Scanner(new File(fileName));

			while (readFile.hasNext()) {
				binaryStr.append(readFile.next());
			}
		} catch (NullPointerException ane) {
			errorMessage = ane.getMessage();
		} catch (IllegalArgumentException ae) {
			errorMessage = ae.getMessage();
		}

		catch (FileNotFoundException fnfe) {
			errorMessage = fnfe.getMessage();
		} catch (IOException ioe) {
			errorMessage = ioe.getMessage();
		}

		catch (SecurityException se) {
			errorMessage = se.getMessage();
		}

		finally {
			if (readFile != null) {
				readFile.close();
			}
			if (errorMessage != null) {
				System.out.println(errorMessage);
			}
		}

		return binaryStr.toString();
	}

	static byte[] BinaryToByteArray(String fileContent) {
		int bytesCount = fileContent.length() / 8;
		byte[] bytes = new byte[bytesCount];
		for (int i = 0; i < bytesCount; i++)

			bytes[i] = Byte.parseByte(fileContent.substring(8 * i, 8), 2);

		return bytes;
	}

	static void WriteFile(String fileName, byte[] fileContent) {
		String errorMessage = null;

		try {

			Files.write(Paths.get(fileName), fileContent);

		} catch (NullPointerException npe) {
			errorMessage = npe.getMessage();
		} catch (IllegalArgumentException iae) {
			errorMessage = iae.getMessage();
		}

		catch (FileNotFoundException fnfe) {
			errorMessage = fnfe.getMessage();
		} catch (IOException ioe) {
			errorMessage = ioe.getMessage();
		}

		catch (SecurityException se) {
			errorMessage = se.getMessage();
		}

		finally {
			if (errorMessage != null) {
				System.out.println(errorMessage);
			}
		}
	}

}
