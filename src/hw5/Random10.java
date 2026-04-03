package hw5;

public class Random10 {

	public void getNum() {

		int sum = 0;

		int[] r10 = new int[10];

		for (int i = 0; i < r10.length; i++) {

			int num = (int) (Math.random() * 101);

			for (int j = 0; j < i; j++) {

				if (r10[j] == num) {

					num = (int) (Math.random() * 101);

					j = -1;

				}

			}

			r10[i] = num;

			sum += num;
		}

		System.out.println("本次亂數結果為:");

		for (int i : r10) {

			System.out.print(i + " ");
		}

		System.out.println();

		System.out.println( "\u001B[36m" + "亂數平均為 " + (double) sum / r10.length);

	}

	public static void main(String[] args) {

		Random10 ra = new Random10();

		ra.getNum();
	}

}
