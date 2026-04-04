package hw4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Transcript {

	// 請算出每位同學考最高分的次數

	private int[][] transArr = { 
			{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
			{ 37, 75, 77, 89, 64, 75, 70, 95 },
			{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
			{ 77, 95, 70, 89, 60, 75, 85, 89 }, 
			{ 98, 70, 89, 90, 75, 90, 89, 90 },
			{ 90, 80, 100, 75, 50, 20, 99, 75 } };

	// 先將每一次考試最高分抓出來

	private int[] findHighest() {

		ArrayList<Integer> highest = new ArrayList<Integer>();

		for (int i = 0; i < transArr.length; i++) {

			int biggest = transArr[i][0];

			for (int j = 0; j < transArr[i].length; j++) {

				if (transArr[i][j] > biggest) {

					biggest = transArr[i][j];
				}
			}

			highest.add(biggest);

		}

		int[] result = new int[highest.size()];

		for (int i = 0; i < highest.size(); i++) {

			result[i] = highest.get(i);
		}

		return result;
	}

	// 利用上一個最高分的陣列來與另一個陣列對比，抓出最哪個學生最高分

	public void highestSduent() {

		ArrayList<Integer> studentId = new ArrayList<Integer>();

		int[] hiestScore = findHighest();

		int[] countNo1 = new int[8];

		for (int i = 0; i < transArr.length; i++) {

			for (int j = 0; j < transArr[i].length; j++) {

				if (hiestScore[i] == transArr[i][j]) {

					studentId.add(j + 1); // 先觀察考最高分的學生是哪幾位

					countNo1[j]++; // 觀察是否八位學生最高分的次數有如上一則資料一樣

				}
			}

		}

//		System.out.println(studentId);

//		System.out.println(Arrays.toString(countNo1));

		for (int s = 0; s < countNo1.length; s++) {
			System.out.print("第 " + (s + 1) + " 號學生獲得最高分的次數: " + countNo1[s] + "\t");

			if ((s + 1) % 4 == 0 && s != countNo1.length - 1) {
				System.out.println();
				System.out.println();
			}

		}

	}

	public static void main(String[] args) {

		Transcript transcript = new Transcript();

		transcript.highestSduent();

	}

}
