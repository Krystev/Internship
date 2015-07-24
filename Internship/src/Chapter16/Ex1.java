package Chapter16;


public class Ex1 {
	private Ex1_Node head;
	private Ex1_Node tail;
	private int count = 0;

	public boolean add(Object element) {

		Ex1_Node newNode = new Ex1_Node(element, null);

		if (head != null) {

			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;

		} else {
			this.head = newNode;
			tail = head;
			head.setPrev(null);
		}
		this.count++;
		return true;
	}

	public boolean remove(Object item) {

		if (this.size() == 1 && this.head.getData().equals(item)) {
			this.head = null;
			this.count--;
			return true;
		}

		if (this.head.getData().equals(item)) {
			this.head = this.head.getNext();
			this.head.setPrev(null);
			this.count--;
			return true;
		}

		if (this.tail.getData().equals(item)) {
			this.tail = this.tail.getPrev();
			this.tail.setNext(null);
			this.count--;
			return true;
		}
		for (Ex1_Node current = this.head; current != null; current = current
				.getNext()) {
			if (current.getData().equals(item)) {
				Ex1_Node previous = current.getPrev();
				Ex1_Node next = current.getNext();
				previous.setNext(next);
				next.setPrev(previous);
				this.count--;
				return true;

			}
		}
		return false;

	}

	public int size() {
		return this.count;
	}

	public boolean isEmpty() {
		if (count == 0) {
			return true;
		}
		return false;
	}

	public boolean contains(Object item) {
		Ex1_Node current = head;
		while (current != null) {
			if ((current.getData() != null && current.getData().equals(item))
					|| ((current.getData() == null) && (item == null))) {
				return true;
			}
			current = current.getNext();

		}
		return false;
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

	public int indexOf(Object item) {
		int index = 0;
		Ex1_Node current = head;

		while (current != null) {
			if ((current.getData() != null && current.getData().equals(item))
					|| ((current.getData() == null) && (item == null))) {
				return index;
			}
			current = current.getNext();
			index++;

		}
		return -1;
	}
	
    public Ex1_Node[] toArray()
    {
    	Ex1_Node[] arr = new Ex1_Node[this.count];
        if (arr.length == 0)
        {
            return arr;
        }

        Ex1_Node current = this.head;
        
        for (int i = 0; i < this.count; i++)
        {
            arr[i] = current;
            current = current.getNext();
        }
        return arr;
    }
    

}
