package hw7;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	public void speak() {
		System.out.println("This is Dog " + nameGet() + " speaking.");
	}
}
