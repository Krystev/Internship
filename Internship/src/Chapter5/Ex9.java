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
			System.out.println("����");

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
				System.out.print("���� ");
				break;
			case 1:
				System.out.print("���� ");
				break;
			case 2:
				System.out.print("��� ");
				break;
			case 3:
				System.out.print("��� ");
				break;
			case 4:
				System.out.print("������ ");
				break;
			case 5:
				System.out.print("��� ");
				break;
			case 6:
				System.out.print("���� ");
				break;
			case 7:
				System.out.print("����� ");
				break;
			case 8:
				System.out.print("���� ");
				break;
			case 9:
				System.out.print("����� ");
				break;
			case 10:
				System.out.print("����� ");
				break;
			case 11:
				System.out.print("���������� ");
				break;
			case 12:
				System.out.print("���������� ");
				break;
			case 13:
				System.out.print("���������� ");
				break;
			case 14:
				System.out.print("������������� ");
				break;
			case 15:
				System.out.print("���������� ");
				break;
			case 16:
				System.out.print("����������� ");
				break;
			case 17:
				System.out.print("������������ ");
				break;
			case 18:
				System.out.print("����������� ");
				break;
			case 19:
				System.out.print("������������ ");
				break;
			case 20:
				System.out.print("�������� ");
				break;
			case 30:
				System.out.print("�������� ");
				break;
			case 40:
				System.out.print("����������� ");
				break;
			case 50:
				System.out.print("�������� ");
				break;
			case 60:
				System.out.print("��������� ");
				break;
			case 70:
				System.out.print("���������� ");
				break;
			case 80:
				System.out.print("��������� ");
				break;
			case 90:
				System.out.print("���������� ");
				break;
			case 100:
				System.out.print("��� ");
				break;
			case 200:
				System.out.print("������ ");
				break;
			case 300:
				System.out.print("������ ");
				break;
			case 400:
				System.out.print("������������ ");
				break;
			case 500:
				System.out.print("��������� ");
				break;
			case 600:
				System.out.print("�������� ");
				break;
			case 700:
				System.out.print("����������� ");
				break;
			case 800:
				System.out.print("���������� ");
				break;
			case 900:
				System.out.print("����������� ");
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
					System.out.print("� ");
				}
			}
			if (cnt == 2) {

				n1 = n % 10;
				if (n > 9) {
					System.out.print("� ");
				}
			}
		}
	}

}
