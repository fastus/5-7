package FileManipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class MapTo2File {
	public static void writeMapToFile(String fileToWrite, Map<Integer, String> map) throws IOException {
		FileWriter fw = new FileWriter(fileToWrite);
		BufferedWriter bw = new BufferedWriter(fw);
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if ((entry.getKey() % 2) == 0) {
				bw.write(entry.getValue() + "\n");
			}
		}
		bw.close();
	}
	public static void printFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		while ((line = br.readLine()) != null) {
		       System.out.println(line);
		   }
		br.close();
	}
}
