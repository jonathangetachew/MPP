package lesson9.labs.prob10;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class Main {
	public static void main(String[] args) {

		/**
		 *
		 * b. stringStream
		 *
		 */
		Stream.of("Bill", "Thomas", "Mary")
				.forEach(s -> System.out.print(s + ", "));

		/**
		 *
		 * c. myIntStream
		 *
		 */
		Stream<Integer> myIntStream = Stream.iterate(1, n -> n + 1).limit(10);
		myIntStream.map(integer -> {
			System.out.println(myIntStream.filter(integer1 -> !integer.equals(integer1)).max(Comparator.comparing(Integer::valueOf)));
			return integer;
		});

		/**
		 *
		 * a. it prints out a single 1 value but program gets into an infinite loop
		 *
		 */

		IntStream ones = IntStream.generate(() -> Integer.parseInt("1")).distinct();
		ones.forEach(System.out::println);
	}
}
