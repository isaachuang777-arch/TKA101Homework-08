package hw5;

import java.util.Scanner;

public class MakingSquare {

	private Scanner sc = new Scanner(System.in);

	private int isNum(String text) {

		while (true) {

			System.out.println(text);

			if (!sc.hasNextInt()) {

				System.out.println("輸入錯誤，請輸入數字");

				sc.next();
			} else {

				return sc.nextInt();
			}
		}

	}

	public void starSquare() {

		int width = isNum("請輸入寬");

		int height = isNum("請輸入高");

		for (int i = 0; i < height; i++) {

			if (i > 0) {
				System.out.println();
			}

			for (int j = 0; j < width; j++) {

				System.out.print("\u001B[33m" + "*");

			}

		}

	}

	public static void main(String[] args) {

		MakingSquare ms = new MakingSquare();

		ms.starSquare();

	}

}
