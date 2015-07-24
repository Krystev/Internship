package Chapter11;

import java.util.Random;

public class Ex5 {
	
	public static void main(String[] args) {
		Ex5 advert = new Ex5();
		advert.print();
	}
	
	private static final String[] GOOD_FRAZES = { "Продуктът е отличен. ",
			"Това е страхотен продукт. ", "Постоянно ползвам този продукт. ",
			"Това е най-добрият продукт от тази категория. " };
	private static final String[] GOOD_THINGS = { "Вече се чувствам добре. ",
			"Успях да се променя. ", "Той направи чудо. ",
			"Не мога да повярвам, но вече се чувствам страхотно. ",
			"Опитайте и вие. Аз съм много доволна. " };
	private static final String[] FIRST_NAMES = { "Диана ", "Петя ", "Стела ",
			"Елена ", "Катя " };
	private static final String[] SECOND_NAME = { "Иванова", "Петрова",
			"Кирова" };
	private static final String[] TOWNS = { "София", "Пловдив", "Варна",
			"Русе", "Бургас" };

	Random rnd = new Random();
	int randomNumber = rnd.nextInt(5);
	int randomNumber2 = rnd.nextInt(3);
	int randomNumber3 = rnd.nextInt(4);

	StringBuilder sb1 = new StringBuilder();

	String fraze = GOOD_FRAZES[randomNumber3];
	String thing = GOOD_THINGS[randomNumber];
	String firstName = FIRST_NAMES[randomNumber];
	String secondName = SECOND_NAME[randomNumber2];
	String town = TOWNS[randomNumber];

	StringBuilder text = sb1.append(fraze).append(thing).append("- ")
			.append(firstName).append(secondName).append(" от ").append(town);

	public void print() {
		System.out.println(text.toString());
	}
}
