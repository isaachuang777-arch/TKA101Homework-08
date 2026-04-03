package hw5;

public class FindBig {

	public int maxElemente(int[][] arrI) {

		int result = 0;

		for (int i = 0; i < arrI.length; i++) {

			int biggest = 0;

			for (int j = 0; j < arrI[i].length; j++) {

				if (arrI[i][j] > biggest) {

					biggest = arrI[i][j];
				}

				result = biggest;
			}

		}

		return result;
	}

	public double maxElemente(double[][] arrD) {

		double result = 0;

		for (int i = 0; i < arrD.length; i++) {

			Double biggest = 0.0;

			for (int j = 0; j < arrD[i].length; j++) {

				if (arrD[i][j] > biggest) {

					biggest = arrD[i][j];
				}

				result = biggest;
			}

		}

		return result;

	}

	public static void main(String[] args) {

		FindBig findBig = new FindBig();

		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		
		System.out.println(findBig.maxElemente(intArray));
		
		System.out.println(findBig.maxElemente(doubleArray));
	}

}
