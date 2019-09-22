package lesson9.labs.prob14;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class Main {
	public static void main(String[] args) {
		MySingletonLazy mySingletonLazy = MySingletonLazy.getInstance();
		System.out.println(mySingletonLazy);
	}
}
