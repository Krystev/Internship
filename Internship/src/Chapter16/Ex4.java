package Chapter16;

public class Ex4 {
	public static final int INITIAL_CAPACITY = 1000;

	private Object[] queue;
	private int headIndex;
	private int tailIndex;
	private int capacity;
	private int count;

	public int count() {
		return count;
	}

	public void cyclicQueue() {
		int capacity = INITIAL_CAPACITY;
		this.headIndex = 0;
		this.tailIndex = 0;
		this.capacity = capacity;
		this.count = 0;
		queue = new Object[capacity];
	}

	public void push(Object element) {
		if (this.count == this.capacity) {
			capacity = capacity * 2;
			Object[] bigger = new Object[capacity];
			int head = headIndex;
			for (int i = 0; i < this.count; i++) {
				bigger[i] = queue[head];
				if (head == queue.length - 1) {
					head = -1;
				}
				head++;
			}
			this.tailIndex = this.count - 1;
			this.headIndex = 0;
			queue = bigger;
		}
		this.count++;
		this.tailIndex++;
		this.tailIndex = tailIndex % capacity;
		queue[tailIndex] = element;
	}

	public Object pop() {
		if (count == 0) {
			System.out.println("Queue is empty!");
		}
		Object element = queue[headIndex];
		queue[headIndex] = null;
		if (headIndex == queue.length - 1) {
			headIndex = 0;
		} else {
			headIndex++;
		}
		this.count--;
		return element;
	}

	public Object peek() {
		if (count == 0) {
			System.out.println("Queue is empty!");
		}
		Object element = queue[headIndex];
		return element;
	}

}
