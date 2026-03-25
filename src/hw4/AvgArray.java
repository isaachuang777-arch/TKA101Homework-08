package hw4;

import java.util.ArrayList;

public class AvgArray {

	// 有個一維陣列如下：
	// {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
	// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

	public void calcuArray() {
		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		double avg;

		int sum = 0;

		ArrayList<Integer> arrBig = new ArrayList<Integer>();
		
		//先算出總合

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		//算出平均
		
		avg = (double) sum / arr.length;
		
		//將大於平均數的數字裝入arr裡面
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>avg) {
				arrBig.add(arr[i]);
			}
		}
		
		System.out.printf("所有元素的平均值為 %.2f%n", avg);
		System.out.println("大於平均數的數字為 " + arrBig);
		

	}
	
	
	public static void main(String[] args) {
		AvgArray avgArray = new AvgArray();
		avgArray.calcuArray();
	}

}
