package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadingSample {

	public static void main(String[] args) {

		File inputFile = new File("./files/Sample.txt");

		long fileSize = inputFile.length();
		int charCount = 0;
		int lineCount = 0;

		// try-with-resource 寫法

//		try (FileReader fr = new FileReader(inputFile); BufferedReader br = new BufferedReader(fr)) { 
//
//			String line;
//
//			while ((line = br.readLine()) != null) {
//
//				if (!line.trim().isEmpty()) {
//					
//					lineCount++;
//					charCount += line.length();
//				}
//
//			}
//
//		} catch (IOException ie) {
//			ie.printStackTrace();
//		}

		// 傳統統寫法
		
		FileReader fr = null;
		BufferedReader br = null;

		try {
			
			fr = new FileReader(inputFile);
			br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {

				if (!line.trim().isEmpty()) {

					lineCount++;
					charCount += line.length();
				}

			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			
		    try {
		        if (br != null) br.close();
		        if (fr != null) fr.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

		System.out.println(inputFile.getName() + "共有" + fileSize + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
	}

}
