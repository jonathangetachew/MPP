package streamexercise.exercise1;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Med extends VisitResult {
	private Long id;

	public Med(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public ResultType getResult() {
		return ResultType.MED;
	}
}
