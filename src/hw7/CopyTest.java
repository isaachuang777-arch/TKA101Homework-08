package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest {

	public void copyFile(String inputFile, String outputFile) throws IOException {    //來複習將方法的exception丟給使用者處理

		File fi = new File(inputFile);
		File fo = new File(outputFile);

		FileReader fr = new FileReader(fi);
		BufferedReader bf = new BufferedReader(fr);

		FileWriter fw = new FileWriter(fo);
		BufferedWriter bw = new BufferedWriter(fw);

		String line;

		try {
			while ((line = bf.readLine()) != null) {
				bw.write(line);
				bw.newLine();
			}

			bw.flush();

		} finally {

			if (bw != null) {
				bw.close();
			}

			if (bf != null) {
				bf.close();
			}
		}
	}
	
	public static void main(String[] args) {
		
		CopyTest ct = new CopyTest();
		
		try {
			
			ct.copyFile("./files/sample.txt","./files/copySample.txt");
			System.out.println("完成複製");
			
		} catch (IOException ie) {
			
			System.err.println("複製失敗" + ie.getMessage());
		}
		
	}

}
