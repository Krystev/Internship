package Chapter5;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number (0 - 999): ");
		int n = input.nextInt();
		int n1 = 0;
		if (n < 0 || n > 999) {
			System.out.print("error");
		}
		if (n == 0) {
			System.out.println("Нула");

		}

		int cnt = 0;
		while (cnt < 3) {
			cnt++;
			if (n == 0) {
				n = n1;
			} else if (n % 100 != 0 && cnt == 1) {
				n1 = n - n % 100;

			}
			if (n % 100 == 0 && cnt == 1) {
				n1 = n;
				cnt = 3;
			}
			if (n1 >= 1 && n1 < 10 && cnt == 2) {

			}
			if (n1 == 0) {
				n1 = 1001;
			}
			switch (n1) {
			case 0:
				System.out.print("Нула ");
				break;
			case 1:
				System.out.print("Едно ");
				break;
			case 2:
				System.out.print("Две ");
				break;
			case 3:
				System.out.print("Три ");
				break;
			case 4:
				System.out.print("Четири ");
				break;
			case 5:
				System.out.print("Пет ");
				break;
			case 6:
				System.out.print("Шест ");
				break;
			case 7:
				System.out.print("Седем ");
				break;
			case 8:
				System.out.print("Осем ");
				break;
			case 9:
				System.out.print("Девет ");
				break;
			case 10:
				System.out.print("Десет ");
				break;
			case 11:
				System.out.print("Единадесет ");
				break;
			case 12:
				System.out.print("Дванадесет ");
				break;
			case 13:
				System.out.print("Тринадесет ");
				break;
			case 14:
				System.out.print("Четиринадесет ");
				break;
			case 15:
				System.out.print("Петнадесет ");
				break;
			case 16:
				System.out.print("Шестнадесет ");
				break;
			case 17:
				System.out.print("Седемнадесет ");
				break;
			case 18:
				System.out.print("Осемнадесет ");
				break;
			case 19:
				System.out.print("Деветнадесет ");
				break;
			case 20:
				System.out.print("Двадесет ");
				break;
			case 30:
				System.out.print("Тридесет ");
				break;
			case 40:
				System.out.print("Четиридесет ");
				break;
			case 50:
				System.out.print("Петдесет ");
				break;
			case 60:
				System.out.print("Шестдесет ");
				break;
			case 70:
				System.out.print("Седемдесет ");
				break;
			case 80:
				System.out.print("Осемдесет ");
				break;
			case 90:
				System.out.print("Деветдесет ");
				break;
			case 100:
				System.out.print("Сто ");
				break;
			case 200:
				System.out.print("Двеста ");
				break;
			case 300:
				System.out.print("Триста ");
				break;
			case 400:
				System.out.print("Четиристотин ");
				break;
			case 500:
				System.out.print("Петстотин ");
				break;
			case 600:
				System.out.print("Шестотин ");
				break;
			case 700:
				System.out.print("Седемстотин ");
				break;
			case 800:
				System.out.print("Осемстотин ");
				break;
			case 900:
				System.out.print("Деветстотин ");
				break;
			default:
				System.out.print("");
				break;
			}

			if (cnt == 1) {
				n1 = n % 100 - n % 10;
			}
			if (cnt == 2) {
				n1 = n % 10;
				if (n1 == 0) {
					System.out.print("и ");
				}
			}
			if (cnt == 2) {

				n1 = n % 10;
				if (n > 9) {
					System.out.print("и ");
				}
			}
		}
	}

}
