package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteAndReadObject {

	public static void main(String[] args) {

		// ===============寫入物件==================

		File dir = new File("C:/data");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File objFile = new File(dir, "Objects.ser");

		Animal[] animals = new Animal[4];
		animals[0] = new Dog("Lucky");
		animals[1] = new Dog("Sami");
		animals[2] = new Cat("Tabatha");
		animals[3] = new Cat("Coco");

		try (FileOutputStream fo = new FileOutputStream(objFile); ObjectOutputStream os = new ObjectOutputStream(fo)) {

			for (int i = 0; i < animals.length; i++) {

				os.writeObject(animals[i]);
			}

			System.out.println("物件寫入完成");

		} catch (IOException ie) {
			ie.printStackTrace();
		}

		// ===============讀取物件==================

		File myFile = new File("C:/data/Objects.ser");

		try (FileInputStream fo = new FileInputStream(myFile); ObjectInputStream oi = new ObjectInputStream(fo);) {

			for (int i = 0; i < 4; i++) {

				Object objRead = oi.readObject();

				if (objRead instanceof Animal) {
					
					Animal a = (Animal) objRead;
					
					a.speak();
				}
			}

		} catch (EOFException eo) {
			System.out.println("讀取完成");
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}

	}

}
