package hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class AwenBorrowMoney {

	public void giveMe1000() {
		
		System.out.println("阿文想借多少錢? 請輸入借款金額");

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		
		int count = 0;
		
		ArrayList<Integer> index = new ArrayList<Integer>();

		int[][] coWorker = { { 2500, 800, 500, 1000, 1200 }, { 25, 32, 8, 19, 27 } };

		for (int i = 0; i < coWorker.length; i++) {
			for (int j = 0; j < coWorker[i].length; j++) {

				if (coWorker[i][j] >= input) {
					
					count++;
					
					index.add(coWorker[i+1][j]);

				}

			}

		}
		
		System.out.println("有錢可借的員工編號為 "+ index + " 共 " + count + " 人");

	}

	public static void main(String[] args) {
		AwenBorrowMoney awenBorrowMoney = new AwenBorrowMoney();
		
		awenBorrowMoney.giveMe1000();
	}
}
