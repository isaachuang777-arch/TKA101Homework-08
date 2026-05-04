package hw9;

public class EatingGame implements Runnable {

	private String name;
	private int food = 10;

	public EatingGame(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= food; i++) {
			System.out.println(name + "吃第" + i + "碗飯");
			
			try {
				// 產生亂數
				int waitingTime = (int)(Math.random()*(3000-500+1))+500;
				Thread.sleep(waitingTime);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "吃完了!");
	}

}
