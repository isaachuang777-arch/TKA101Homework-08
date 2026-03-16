package hw2;

public class JavaHw2 {
	
	public static void main(String[] args) {
		
//		evenSum();
		
//		product1();
		
//		product2();
		
//		findPattern();
		
//		nomore4();
		
//		printNumInTri();

		printAlphInTri();
		
		}
	
	//1.請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
	
	public static void evenSum() {

		// for 迴圈版本 
		
		int evenSum = 0;
		
		for(int i = 0; i <= 1000 ; i += 2) {
			
			evenSum += i;
		}
		
		// 或者用數學算法:
		
		int evenStater = 2;
		
		int evenEnd = 1000;
		
		int avgNum = (evenStater + evenEnd) / 2;
		
		int allNum = evenEnd / 2;
		
		int evenSum2 =  avgNum * allNum;
		
		System.out.println(evenSum2);
		
		}
	
	public static void product1() {
		
		//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10)
		// for 迴圈
		
		int result = 1;
		
		for(int i = 1; i <= 10 ; i++) {
			result *= i;	
		}
		
		System.out.println(result);
	}
	
	public static void product2() {
		
		//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10)
	    // while 迴圈
		
		int result = 1;
		
		int stater = 1;
		
		while(stater < 11) {
			
			
			result *= stater;
			
			stater++;
		}
		
		System.out.println(result);	
	}
	
	public static void findPattern() {
		
		//請設計一隻Java程式，輸出結果為以下：
		//1 4 9 16 25 36 49 64 81 100
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print((int)Math.pow(i,2) + " ");
		}
		
	}
	
	
	public static void nomore4() {
		
		//阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。
		//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		int counts = 0;							//不管個位數或十位數皆不能有4
		                                        //所以可以拆成個位數以及十位數來看
		for(int i = 1; i <= 49; i++) {          
			
			if ( i != 4 && i < 10) {
				System.out.print(i + " ");
				counts++;
			}
			
			int tens = i % 10;					//用Modulo取餘數來把十位數轉為個位數
			
			if (tens != 4 && i > 10) {
				System.out.print(i + " ");
				counts++;
			}
		}
		
		System.out.println();
		
		System.out.print("總共 " + counts + " 碼 ");
	}
	
	
	public static void printNumInTri() {
		
		for( int i = 10; i >=1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void printAlphInTri() {
		
		for(int i = 10; i < 16 ; i++) {
			for(int j = 10; j <= i; j++) {
				System.out.printf("%X",i);
			}
			
			System.out.println();
		}
	}
	
	}


