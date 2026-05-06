package hw9;

public class TestEatingGame {
	
	public static void main(String[] args) {
		
		System.out.println("-----大胃王快食比賽開始-----");
		
		EatingGame bunsMan = new EatingGame("饅頭人");
		EatingGame james = new EatingGame("詹姆士");
		
		//建立執行緒
		Thread t1 = new Thread(bunsMan);
		Thread t2 = new Thread(james);
		
		//啟動執行緒
		t1.start();
		t2.start();
		
		try {
			// 避免 main 方法直接跑到最下面 System.out.println("-----大胃王快食比賽結束-----"); 用join方法讓主執行緒等子執行緒結束
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----大胃王快食比賽結束-----");
	}

}
