package lesson10.labs.prob6;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class ThreadsafeQueue {
	class Node {
		Object value;
		Node next;
	}
	private Node head;
	private Node tail;
	synchronized public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
	}
	synchronized public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}
}
