package hw4;

public class FindVowel {

	// 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

	public void findAEIOU() {

		String[] arrS = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int count = 0;

		// 使用如js的forEach的用法 ("型別" 變數名 : 陣列)
		// 第二層一樣可以繼續使用如forEach的用法，
		// 只是必須要把char字元變成字元陣列,(譬如c.toCharArray)
		// 第二層由於把字串每一個字母湊再一起去建立陣列，如果單字量龐大，或字母過多會影響效能

		for (String s : arrS) {
			for (char c : s.toCharArray()) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}

		System.out.println("總共有 " + count + " 個母音");

	}
	
	public static void main(String[] args) {
		
		FindVowel findVowel = new FindVowel();
		
		findVowel.findAEIOU();
	}

}
