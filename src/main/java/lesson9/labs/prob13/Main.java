package lesson9.labs.prob13;

import java.util.List;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class Main {
	public static void main(String[] args) {
		// set up
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();

		copies.forEach(BookCopy::changeAvailability);

		// test
		System.out.println(book.isAvailable());
	}
}
