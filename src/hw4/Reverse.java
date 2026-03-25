package hw4;

//請建立一個字串，經過程式執行後，輸入結果是反過來的

public class Reverse {
	
	//方法一: for loop 倒著跑，用charAt反向加回變數String

	public String printR(String str) {

		String result = "";

		for (int i = str.length() -1; i >= 0; i--) {

			result += str.charAt(i);
		}

		return result;
	}
	
	
	
	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		
		System.out.println(reverse.printR("Hello World"));
		
		// 方法二 直接使用Stringbuilder內建函式reverse()後轉回字串toString()
		
		String str = "Hello World";
		
		String reversed = new StringBuilder(str).reverse().toString();
		
		System.out.println(reversed); // 輸出: dlroW olleH
		
	}

}
