package Chapter11;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Ex6 rugaq = new Ex6();
		rugaq.print();
	}

	private static final String[] BAD_FRAZES = { "�� �� ... � ",
			"���� �� ... � ", "�� �� ... � ", "�� �� .... �� ������ � " };
	private static final String[] WHERE_THINGS = { "���� ", "������ ", "���� ",
			"����� " };
	private static final String[] ADDRESS = { "������ ", "����� ",
			"�������� ", "������� " };
	private static final String[] EPITHET = { "������ ", "������� ", "��� ",
			"������ " };

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
