import java.util.*;
public class Pages {
	int total_pages = 20;
	public synchronized void printing(int pages) {
		if(total_pages > pages) {
			System.out.println("Number of Pages: " + total_pages);
			System.out.println("--------------Printing Successfull--------------");
			total_pages = total_pages - pages;
			System.out.println("Pages Left After Printing: " + total_pages);
		}
		else {
			System.out.println("There are only " + total_pages + " pages in the printer");
			System.out.println("Thread will be on Wait!!!!!!!!");
			System.out.println("Printing Failed!!!!!!!!!");
		}
	}
}
