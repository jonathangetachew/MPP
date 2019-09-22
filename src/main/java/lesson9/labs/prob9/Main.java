package lesson9.labs.prob9;

import java.util.stream.IntStream;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class Main {
	public static void main(String[] args) {
		printSquares(4);
	}

	public static void printSquares(int num) {
		IntStream intStream = IntStream.iterate(1, n -> square(n)).limit(num);
		intStream.forEach(value -> System.out.print(value + ", "));
	}

	public static int square(int n) {
		return (n * n)+1;
	}
}
