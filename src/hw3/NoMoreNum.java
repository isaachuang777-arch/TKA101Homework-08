package hw3;

import java.util.Scanner;

// 輸入變數來排除1~49的號碼
// 隨機輸出六個號碼


public class NoMoreNum {
	
	public void getNum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("阿文...請輸入你討厭的數字");
		
		int input = sc.nextInt();
			
		int count = 0;
		
		
		//=======================================
		//計算容器數字
		
		for(int i = 1; i <=49; i++) {
			int units = i % 10; //取餘數
			int tens = i /10;   //取十位數
			
			if(units != input && tens != input) {
				count++;
			}
		}
		
		//將算好的array總數量(count)來建立一個新的array(num[])
		
		int num[] = new int [count];
		
		int arrIndex = 0;
		
		//先取餘數(個位數)以及十位數來判斷,如果與input不同則可以放進去array(num)裡面
		
		for(int i = 1; i <= 49; i++) {
			int units = i % 10;
			int tens = i /10;
			
			if(units != input && tens != input) {
				
				num[arrIndex] = i;
				arrIndex++;
				
			}
		}
		
		//設置一個for loop,上限範圍利用之前的count為上限依序列印出來
		
		for(int i = 0; i < count; i++) {
			System.out.print(num[i] + "\t");
			
			if( i % 6 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("總共有" + count + "數字");
		
		
//====================================================================================
		
		//重點: math.random 只跑過一次，值就會固定，所以要讓他重跑才會出新的值
		//因此: 配合loop的標籤塞在if判斷式內,只要暫存的值(tempNum) == result[i]
		//將強制continue退到標籤while重新再跑while產出新的亂數值重新配對
		
		int loopCounts = 0;
		
		int result[] = new int[6];
		
		
		outer:
		while (loopCounts < 6) {
			
			int randomIndex = (int)(Math.random()*count);
			int tempNum = num[randomIndex];
			
			for(int i = 0; i <= loopCounts; i++) {
				
				if(result[i] == tempNum) {
					
					continue outer;
				}	
			}
			
			result[loopCounts] = tempNum;
			loopCounts++;
			
			}
		
		System.out.println();
		
		System.out.println("===========================");
		
		System.out.println("六個隨機號碼為");
		
		for(int i = 0; i < 6;i++) {
			
			System.out.print(result[i] + " ");
			
				}
		
		}
			
	
	public static void main(String[] args) {
		
		
		NoMoreNum guess = new NoMoreNum();
		
		guess.getNum();
	}
	

}
