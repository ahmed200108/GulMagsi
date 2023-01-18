import java.util.*;
public class Printer extends Thread{
	static Pages page;
	int pages;
	
	public void run() {
		page.printing(pages);
	}
	
	public static void main(String[] args) {
		page = new Pages();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Pages you Want to Print: ");
		int a = sc.nextInt();
		Printer t1 = new Printer();
		t1.pages = a;
		t1.start();
		
		//This is the Printing class of Ouput.
	}
}
