package streamexercise.exercise3;

/**
 * Created by Jonathan on 9/20/2019.
 */

@FunctionalInterface
public interface HexFunction<T, U, V, W, X, Y, Z> {
	Z apply(T t, U u, V v, W w, X x, Y y);
}
