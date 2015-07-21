package Chapter4;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String companyName = "Vratsa Soft";
		String address = "Vratsa";
		long phone = 359883314061L;
		long fax = 35992626319L;
		String webSite = "www.vratsasoft.com";
		String manager = "Teo";

		String managerFirstName = "Teodor";
		String managerLastName = "Kostadinov";
		long managerPhone = 35912345678L;

		System.out
				.printf("Company name: %s%nAddress: %s%nCompany Number: %d%nFax: %d%nWeb Site: %s%nCompany Manager: %s%n"
						+ "Manager First Name: %s%nManager Last Name: %s%nPhone number: %d%n",
						companyName, address, phone, fax, webSite, manager,
						managerFirstName, managerLastName, managerPhone);
	}

}
