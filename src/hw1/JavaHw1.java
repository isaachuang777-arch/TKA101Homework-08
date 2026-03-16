package hw1;

public class JavaHw1 {
	
	public static void main(String[] args) {
		
    // 請設計一隻Java程式，計算12，6這兩個數值的和與積
	
//	int num1 = 12, num2 = 6;
//	
//	int sum = num1 + num2;
//	
//	int multiple =  num1 * num2;
//	
//	System.out.println("和為 " + sum);
//	
//	System.out.println("積為 " + multiple);
	
	//請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		
    //或更簡單的方式為 leftsE = 200 % 12
	
//	int eggs = 200;
//	
//	int maxD = 200 / 12;
//	
//	int leftsE = eggs - (maxD * 12);
//		
//	System.out.println("總共" + maxD + "打");
//	System.out.println("剩下" + leftsE + "顆");
	
	//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	
//	int second = 256559, minutes = second / 60, hours = minutes / 60, days = hours / 24;
//	
//	int leftS = second % 60, leftM = minutes % 60, leftH = hours % 24;
//	
//	System.out.print
//	(second + " = " + days + " 天 " + leftH + " 小時 " 
//	+ leftM + " 分鐘 " + leftS + " 秒 ");
	
	
	// 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
	
//	final double PI = 3.1415;
//	
//	int radius = 5;
//	
//	double result = PI * Math.pow(radius, 2);
//	
//	System.out.printf("圓面積是 %.2f%n",result);
	
	// 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
	//金加利息共有多少錢?
	
//	int founds = 1_500_000;
//	
//	double interests = founds * Math.pow(1.02,10);
//	
//	double sum = founds + interests;
//	
//	System.out.printf("利息為 %.2f%n",interests);
//	System.out.printf("利息加本金為 %.2f%n",sum);
		
		//請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		
//		System.out.println(5 + 5);
		// result = 10, 原因是若沒宣告的情況下一般數字的型別為int,故 5 + 5 = 10
		
//		System.out.println(5 + '5');
		// result = 58, 因為型別 char 的 '5' 與 int 的 5 運算時將自動轉為unicode的53
		// 故 53 + 5 = 58
		
		System.out.println(5 + "5");
		// result = 55, 當字串型別與其他int運算時會以字串 + 字串的狀態組合
	}


}
