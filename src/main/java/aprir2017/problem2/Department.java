package aprir2017.problem2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public abstract String getName();

	public void addMessage(String message) {
		if (message != null) {
			queue.enqueue(message);
		}
	}

	public String nextMessage()  {

		try {
			return queue.dequeue();
		} catch (EmptyQueueException e) {
			e.printStackTrace();
		}

		return null;
	}

	public StringQueue getQueue() {
		return queue;
	}
}
