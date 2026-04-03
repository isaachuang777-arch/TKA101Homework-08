package hw6;

public class Calculator {

	private int x;

	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		
		if(x == 0 && y == 0) {
			
			throw new CalException("0 的 0 次方沒有意義");
		}
		
		else if (y < 0) {
			
			throw new CalException("次方為負數，結果回傳不為整數");
		}
		
		else {
			
			this.x = x;
			
			this.y = y;
		}

	}

	public void calSetX(int x) {

		this.x = x;
	}

	public void calSetY(int y) throws CalException {

		if (y < 0) {

			throw new CalException("次方為負數，結果回傳不為整數");

		} else {

			this.y = y;
		}

	}

	public int claGetX() {
		return this.x;
	}

	public int claGetY() {
		return this.y;
	}

	public int powerXY() {

		int result = (int) Math.pow(x, y);

		return result;

	}

}
