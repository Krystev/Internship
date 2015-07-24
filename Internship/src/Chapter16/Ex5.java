package Chapter16;

import java.util.LinkedList;

public class Ex5 {
	

	public static LinkedList<Integer> MergeSort(LinkedList<Integer> seq) {
		int count = seq.size();

		if (count <= 1) {
			return seq;
		}

		LinkedList<Integer> left = new LinkedList<Integer>();
		LinkedList<Integer> right = new LinkedList<Integer>();
		
		int middleInd = count / 2;

		while (seq.size() != middleInd) {
			left.addLast(seq.getFirst());
			seq.removeFirst();
		}

		while (seq.size() != 0) {
			right.addFirst(seq.getFirst());
			seq.removeFirst();
		}

		left = MergeSort(left);
		right = MergeSort(right);

		return Merge(left, right);
	}

	static LinkedList<Integer> Merge(LinkedList<Integer> left,
			LinkedList<Integer> right) {

		LinkedList<Integer> merged = new LinkedList<Integer>();

		while (left.size() != 0 && right.size() != 0) {
			if (left.getFirst().compareTo(right.getFirst()) > 0) {
				merged.addLast(right.getFirst());
				right.removeFirst();
			} else {
				merged.addLast(left.getFirst());
				left.removeFirst();
			}
		}

		if (left != null) {
			while (left.size() != 0) {
				merged.addLast(left.getFirst());
				left.removeFirst();
			}
		} 

		return merged;
	}

}
