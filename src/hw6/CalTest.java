package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CalTest ct = new CalTest();

		while (true) {

			try {

				System.out.println("請輸入 x 的值");

				String inputX = sc.nextLine();

				int x = ct.isNum(inputX);

				System.out.println("請輸入 y 的值");

				String inputY = sc.nextLine();

				int y = ct.isNum(inputY);

				Calculator cal = new Calculator(x, y);

				System.out.println(x + " 的 " + y + " 次方等於 " + cal.powerXY());

				break;

			} catch (CalException e) {

				System.out.println(e.getMessage());

			} catch (NumberFormatException e) {

				System.out.println("請輸入數字，不得空白");

			} catch (Exception e) {

				System.out.println("未知錯誤");

			}

		}
		
		sc.close(); // <---------Scanner 記得關掉 不然佔資源
	}
	
	
	// 處理如果使用者輸入非數字，由上一段 sc.nextLine() 以 String 的型別來儲存，並用 NumberFormatException

	public int isNum(String input) throws NumberFormatException {

		if (input == null || input.trim().isEmpty()) {

			throw new NumberFormatException();
		}

		return Integer.parseInt(input.trim());
	}

}
