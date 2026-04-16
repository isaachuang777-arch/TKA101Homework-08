package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class AppendRandom {

	int[] random() {                               //取得亂數陣列方法

		ArrayList<Integer> arr = new ArrayList<Integer>();

		int num = 0;

		for (int i = 0; i < 10; i++) {

			num = (int) (Math.random() * 1000) + 1;

			arr.add(num);
		}

		int[] result = new int[arr.size()];

		for (int i = 0; i < arr.size(); i++) {

			result[i] = arr.get(i);
		}

		return result;

	}
	
	
	//=============================================================

	public static void main(String[] args) {

		AppendRandom ar = new AppendRandom();

		File dir = new File("./files");                  //設置定位接著建立資料夾

		if (!dir.exists()) {

			dir.mkdir();
		}

		File fi = new File(dir, "random.txt");         //建立檔案

		try (FileOutputStream fo = new FileOutputStream(fi, true);          // try with resource 寫法
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				PrintStream ps = new PrintStream(bo);) {

			int[] result = ar.random();

			for (int i = 0; i < result.length; i++) {

				ps.println(result[i]);

			}
			
			 System.out.println("資料已成功寫入 " + fi.getAbsolutePath());

		} catch (IOException ie) {
			ie.printStackTrace();
		}

	}

}
