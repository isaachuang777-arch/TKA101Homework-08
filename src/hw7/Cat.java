package hw7;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Cat " + nameGet() + " speaking!");
	}

}
