import java.util.*;
public class UserThread2 extends Thread {
	BankAccount bankAcc;
	Scanner sc = new Scanner(System.in);
	
	public UserThread2(BankAccount bankAcc) {
		this.bankAcc = bankAcc;
	}
	
	synchronized public void menu() {
		try {
			System.out.println(Thread.currentThread().getName() + ":\nSelect an Option as Number:\n1: Withdrawal");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				bankAcc.withdraw(20000);
				break;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public void run() {
		menu();
	}
}
