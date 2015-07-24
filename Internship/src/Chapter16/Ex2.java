package Chapter16;
public class Ex2 {

	private Ex1_Node head;
	private Ex1_Node tail;
	private int count = 0;

	public void push(Object item) {
		Ex1_Node newNode = new Ex1_Node(item, null);

		if (head == null) {
			this.head = newNode;
			this.tail = this.head;
			head.setPrev(null);

		} else if (head != null) {

			newNode.setPrev(tail);
			tail.setNext(newNode);
			this.tail = newNode;

		}
		this.count++;
	}

	public Ex1_Node peek() {
		return tail;
	}

	public Ex1_Node pop() {
		Ex1_Node top = null;
		if (count == 1) {
			top = head;
			head = null;
			tail = null;
			this.count--;

		} else if (count > 1) {
			top = tail;
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
			this.count--;
		}
		return top;
	}

	public Object get(int pos) {

		if (head != null) {
			Ex1_Node temp = head;
			int tempCount = 0;
			while (temp.getNext() != null && tempCount < pos) {
				temp = temp.getNext();
				tempCount++;
			}
			if (tempCount == pos) {
				return temp.getData();
			}

		}
		return null;
	}

	public boolean contains(Object item) {
		Ex1_Node current = head;
		while (current != null) {
			if ((current.getData() != null && current.getData().equals(item))
					|| (current == null && item == null)) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public int size() {
		return this.count;
	}

	public void clear() {

		if (count > 1) {

			int currentCount = this.count;

			for (int i = 0; i < currentCount - 1; i++) {
				tail.getPrev().setNext(null);
				tail = tail.getPrev();
				this.count--;
			}
		}

		if (count == 1) {
			head = null;
			tail = null;
			this.count--;
		}

	}
	
	public Ex1_Node[] toArray() {
		
		Ex1_Node current = head;
		Ex1_Node[] arr = new Ex1_Node[size()];
		
		for (int i = 0; i < size(); i++) {
			arr[i] = current;
			current = current.getNext();
		}
		
		return arr;
	}

}
