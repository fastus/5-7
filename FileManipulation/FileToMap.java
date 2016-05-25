package FileManipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FileToMap {
	public static LinkedHashMap<Integer, String> readFileToMap(String fileToRead) throws FileNotFoundException {
		File file = new File(fileToRead);
		LinkedHashMap<Integer, String> result = new LinkedHashMap<>();
		Scanner in = new Scanner(file);
		Integer i = 1;
		while (in.hasNextLine()) {
			result.put(i, in.nextLine());
			i++;
		}
		in.close();
		return result;
	}

	public static void printMap(Map<Integer, String> mapFromFile) {
		for (Map.Entry<Integer, String> entry : mapFromFile.entrySet()) {
			System.out.println("Line: " + entry.getKey() + " Value : " + entry.getValue());
		}
	}

}
