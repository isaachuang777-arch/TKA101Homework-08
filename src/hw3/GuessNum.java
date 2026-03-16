package hw3;

import java.util.Scanner;

public class GuessNum {
	
	//建立一個方法來取亂數並做if判斷式比對
	
	
	public void guessN() {
		
		int getRandom = (int) (Math.random() * 100);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("開始猜數字吧");
			System.out.println("=====================");
			int n = sc.nextInt();
			
			if( n != getRandom && n > getRandom) {
				
				System.out.println("猜錯了,答案小於 " + n);
				
				continue;		
			}
			
			else if(n != getRandom && n < getRandom) {
				
				System.out.println("猜錯了,答案大於 " + n);
				
				continue;
			}
			
			else {
				
				System.out.println("猜對了,答案是 " + n);
				break;
			}
				
		}
			
		}
	
	public static void main(String[] args) {
		
		GuessNum  guessTest = new GuessNum();
		
		guessTest.guessN();
		
	}
	
		
	}
	
	

	
	


