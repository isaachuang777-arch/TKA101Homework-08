package hw8;

import java.util.Objects;

//請設計一個Train類別，並包含以下屬性：
// 班次number，型別為int - 車種type，型別為String - 出發地start，型別為String
// 目的地dest，型別為String - 票價price，型別為double

public class Train implements Comparable<Train> {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	// 建構子
	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	};

	public Train() {
	}

	// getter 跟 setter

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	// -------------------------------------------------------------//
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// -------------------------------------------------------------//
	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	// -------------------------------------------------------------//
	public String getDest() {
		return dest;
	}

	public void setSDest(String dest) {
		this.dest = dest;
	}

	// -------------------------------------------------------------//
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// 只示範一次的右鍵Source > Generate hashCode() and equals() 而自訂物件不重複這件事情仰賴下面的 hasCode跟equals

	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	// 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
	// 實作Comparable 給TreeSet

	public int compareTo(Train number) {
		if (this.number > number.number)
			return -1;
		if (this.number < number.number)
			return 1;
		return 0;
	}

	public String toString() {
		return String.format("(%d --%s-- %s -> %s : %.0f)", number, type, start, dest, price);
		
	}

}
