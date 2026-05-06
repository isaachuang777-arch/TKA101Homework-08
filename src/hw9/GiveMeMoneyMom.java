package hw9;

class BankAccount {
	private int balance = 0;

	// 媽媽存款
	public synchronized void deposit(int amount) {
		while (balance > 3000) {
			System.out.println("媽媽看到存款超過3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		balance += amount;
		System.out.println("媽媽存了" + amount + "，戶頭現在有" + balance);
		notifyAll();
	}

	// 熊大領錢
	public synchronized void withdraw(int amount) {

		while (balance < amount) {
			System.out.println("熊大看到戶頭沒錢，無法領錢");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		balance -= amount;
		System.out.println("熊大領了" + amount + "，戶頭剩下" + balance);
		if (balance < 2000) {
			System.out.println("熊大打給媽媽要錢");
			notifyAll();
		}
	}
}

class Mom extends Thread {

	BankAccount account;

	Mom(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000); // 每次匯兩千
		}
	}
}

class Brown extends Thread {

	BankAccount account;

	Brown(BankAccount account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000); // 每次領一千
		}
	}
}


public class GiveMeMoneyMom{
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		Mom mom = new Mom(account);
		Brown brown = new Brown(account);
		
		mom.start();
		brown.start();
		
	}
	
	
	
}
