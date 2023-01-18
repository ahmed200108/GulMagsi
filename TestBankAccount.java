public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount();
		UserThread1 t1 = new UserThread1(bankAcc);
		UserThread2 t2 = new UserThread2(bankAcc);
		
		t1.setName("User A");
		t2.setName("User B");
		t1.start();
		t2.start();
	}
}
