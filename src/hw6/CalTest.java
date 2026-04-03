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
				
			} finally {                     //<----------突然發現scanner不關的話會佔資源 最簡單的做法如果直接寫在後面
				                            //           跳出exception會導致沒辦法執行關閉scanner所以加上finally無論如何都會關

				if (sc != null) {
					
					sc.close();
				}

			}
		}

	}

	public int isNum(String input) throws NumberFormatException {

		if (input == null || input.trim().isEmpty()) {

			throw new NumberFormatException("格式不對，不得輸入空白");
		}

		return Integer.parseInt(input.trim());
	}

}
