package Chapter16;
public class Ex1_Node {
	private Object data;
	private Ex1_Node next;
	private Ex1_Node prev;

	public Ex1_Node(Object data, Ex1_Node next) {
		super();
		this.data = data;
		this.next = next;

	}

	public Ex1_Node(Object data) {
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Ex1_Node getNext() {
		return next;
	}

	public void setNext(Ex1_Node next) {
		this.next = next;
	}

	public Ex1_Node getPrev() {
		return prev;
	}

	public void setPrev(Ex1_Node prev) {
		this.prev = prev;
	}
}
