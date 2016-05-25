package FileManipulation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

public class StartFileManipulate {

	public static void main(String[] args) {
		String fileToRead = "C:\\workspace\\Izmailov_7_8\\src\\FileManipulation\\fromFile.txt";
		String fileToWrite = "C:\\workspace\\Izmailov_7_8\\src\\FileManipulation\\toFile.txt";
		try {
			LinkedHashMap<Integer, String> mapFromFile = FileToMap.readFileToMap(fileToRead);
			FileToMap.printMap(mapFromFile);
			System.out.println();
			MapTo2File.writeMapToFile(fileToWrite, mapFromFile);
			System.out.println("New file with even lines only :");
			MapTo2File.printFile(fileToWrite);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
