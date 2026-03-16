package hw2;

public class TestNineNine {

	public static void main(String[] args) {

		// 使用for迴圈+ while迴圈

//		for(int i = 1; i <= 9; i++) {
//			int j = 1;
//			while(j <= 9) {
//				System.out.print( i + "X" + j + "=" + i * j + "\t");
//				j++;
//			}			
//			System.out.println();
//		}

		// 使用for迴圈+ do while迴圈

//		for(int i = 1; i <= 9; i++) {
//			
//			int j = 1;
//			
//			do {	
//				System.out.print( i + "X" + j + "=" + i * j + "\t");
//				j++;
//			}while(j<=9);
//			
//			System.out.println();
//		}

		// 使用while迴圈+ do while迴圈

		int p1 = 1;

		while (p1 <= 9) {

			int p2 = 1;

			do {
				System.out.print(p1 + "X" + p2 + "=" + p1 * p2 + "\t");
				p2++;
			}

			while (p2 <= 9);

			p1++;

			System.out.println();
		}

	}

}
