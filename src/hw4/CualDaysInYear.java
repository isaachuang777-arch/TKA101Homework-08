package hw4;

import java.util.Scanner;

public class CualDaysInYear {

	// 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
	// 例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」

	// 有幾個條件可以拆幾個一般方法來用
	// 1.資料輸入判斷是否為數字
	// 2.判斷是不是閏年
	// 3.判斷格式是否合理
	// 4.加總算出

	private Scanner sc = new Scanner(System.in);

	// 判斷是否為數字

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

	// 建立月份陣列並檢查是否為閏年，如果是將二月天數改為29

	private int[] getArrD(int inputY) {

		int[] arrD = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((inputY % 4 == 0 && inputY % 100 != 0) || inputY % 400 == 0) {

			arrD[1] = 29;
		}

		return arrD;
	}

	// 判斷數字格式是否合理

	private boolean isVaild(int inputM, int inputD, int[] arrD) {

		if (inputM < 1 || inputM > 12) {
			return false;
		}

		if (inputD < 1 || inputD > arrD[inputM - 1])
			return false;

		return true;
	}

	// 最後將所有方法組合算出總數

	public void result() {

		int inputY, inputM, inputD;

		int[] monthD;

		while (true) {

			inputY = isNum("請輸入年");

			inputM = isNum("請輸入月");

			inputD = isNum("請輸入日");

			monthD = getArrD(inputY);

			if (isVaild(inputM, inputD, monthD)) {

				break;

			} else {
				System.out.println("日期格式不正確（例如月份1-12，或平年2月不可超過28號）" + "，請重新輸入");
			}

		}

		int result = 0;

		for (int i = 0; i < inputM - 1; i++) {

			result += monthD[i];
		}

		result += inputD;

		System.out.println("輸入的日期為該年的 " + result + " 天");

	}

	public static void main(String[] args) {

		CualDaysInYear cualDaysInYear = new CualDaysInYear();

		cualDaysInYear.result();
	}

}
