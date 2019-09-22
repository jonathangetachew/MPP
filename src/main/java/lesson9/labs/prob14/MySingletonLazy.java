package lesson9.labs.prob14;

import java.util.Optional;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class MySingletonLazy {
	private static MySingletonLazy INSTANCE = null;
	private MySingletonLazy() {
	}

	public static MySingletonLazy getInstance() {
		return Optional.ofNullable(INSTANCE).orElse(new MySingletonLazy());
	}
}
