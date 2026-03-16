package hw3;

import java.util.Scanner;

public class DefiTriangle {
	
	// 先寫一個物件來用來判斷三角形
	
	public void defi(int a, int b, int c) {
		
		boolean isTri = false;
		
		
		if (a + b > c && a + c > b && b + c > a) {
			
			isTri = true;
			
		} 
		
		else {isTri = false;}
		
		if (isTri == false) {
			
			System.out.println("不是三角形");
		}
		
		if (isTri == true) {
			
			if ( a == b && b == c) {
				
				System.out.println("正三角形");
				
			}
			
			else if( a == b || b == c || a == c) {
				
				System.out.println("等腰三角形");
			}
			
			
			else if ((int)Math.pow(a,2) + (int)Math.pow(b,2) == (int)Math.pow(c,2)
					
					|| (int)Math.pow(b,2) + (int)Math.pow(c,2) == (int)Math.pow(a,2)
					
					|| (int)Math.pow(a,2) + (int)Math.pow(c,2) == (int)Math.pow(b,2)
					) {
				System.out.println("直角三角形");	
			}
			
			else {
				System.out.println("其他三角形");
			}
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("請輸入: ");
		
		System.out.print("請輸入第一條邊 (a): ");
        int a = sc.nextInt();

        System.out.print("請輸入第二條邊 (b): ");
        int b = sc.nextInt();

        System.out.print("請輸入第三條邊 (c): ");
        int c = sc.nextInt();
        
        DefiTriangle defiTest = new DefiTriangle();
        
        defiTest.defi(a,b,c);
		
	}

}
