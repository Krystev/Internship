package Chapter11;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Ex6 rugaq = new Ex6();
		rugaq.print();
	}

	private static final String[] BAD_FRAZES = { "Ще те ... в ",
			"Щети го ... в ", "Да те ... в ", "Ще го .... на женати в " };
	private static final String[] WHERE_THINGS = { "носа ", "устата ", "гъза ",
			"ушите " };
	private static final String[] ADDRESS = { "глупак ", "идиот ",
			"пустиняк ", "смешник " };
	private static final String[] EPITHET = { "глупав ", "смахнат ", "тъп ",
			"смешен " };

	Random rnd = new Random();

	StringBuilder sb = new StringBuilder();

	StringBuilder text = sb.append(BAD_FRAZES[rnd.nextInt(4)])
			.append(WHERE_THINGS[rnd.nextInt(4)])
			.append(ADDRESS[rnd.nextInt(4)]).append(EPITHET[rnd.nextInt(4)])
			.append(EPITHET[rnd.nextInt(4)]).append(EPITHET[rnd.nextInt(4)])
			.append("!");

	public void print() {
		System.out.println(text.toString());
	}

}
