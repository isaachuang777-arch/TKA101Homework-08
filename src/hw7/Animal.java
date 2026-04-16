package hw7;

import java.io.Serializable;

public abstract class Animal implements Serializable {

	private static final long serialVersionUID = 1L; // UID 固定好，以後重讀修改沒煩惱
	private String name;

	public Animal() {
	};

	public Animal(String name) {

		this.name = name;
	}

	public void nameSet(String name) {

		this.name = name;
	}

	public String nameGet() {
		return name;
	}
	
	public abstract void speak();
}
