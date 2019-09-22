package streamexercise.exercise1;

/**
 * Created by Jonathan on 9/19/2019.
 */

@FunctionalInterface
public interface TriFunction<T, U, V, W> {
	W apply(T t, U u, V v);
}
