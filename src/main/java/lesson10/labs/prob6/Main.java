package lesson10.labs.prob6;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class Main {

	public static void main(String[] args) {

		// Unsafe Queue
		Runnable runnable = () -> {
			for (int i = 0; i < 500; i++) {
				new Queue().add("Hello");
			}
		};

		for (int i = 0; i < 100; i++) {
			new Thread(runnable).start();
			System.out.println("Thread Created");
		}

		// Unsafe Queue
		Runnable runnable2 = () -> {
			for (int i = 0; i < 500; i++) {
				new ThreadsafeQueue().add("World");
			}
		};

		for (int i = 0; i < 100; i++) {
			new Thread(runnable2).start();
			System.out.println("Safe Thread Created");
		}

	}

}
