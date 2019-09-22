package streamexercise.exercise1;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Lab extends VisitResult {

	private Long id;

	public Lab(Long id) {
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
		return ResultType.LAB;
	}
}
