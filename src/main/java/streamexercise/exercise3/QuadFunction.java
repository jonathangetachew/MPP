package streamexercise.exercise3;

/**
 * Created by Jonathan on 9/20/2019.
 */

@FunctionalInterface
public interface QuadFunction<T, U, V, W, X> {
	X apply(T t, U u, V v, W w);
}
