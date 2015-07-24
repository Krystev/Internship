package Chapter16;

import java.util.LinkedList;

class Ex3<T> {
	private LinkedList<T> startDeck;
	private LinkedList<T> endDeck;

	public Ex3()

	{
		this.startDeck = new LinkedList<T>();
		this.endDeck = new LinkedList<T>();
	}

	public void addToStart(T element) {
		this.startDeck.addFirst(element);
	}

	public void addToEnd(T element) {
		this.endDeck.addLast(element);
	}

	public T removeFromStart() {
		T value = this.startDeck.getFirst();
		this.startDeck.removeFirst();
		return value;
	}

	public T removeFromEnd() {
		T value = this.endDeck.getLast();
		this.endDeck.removeLast();
		return value;
	}

	public void clear() {
		this.startDeck.clear();
		this.endDeck.clear();
	}
}


