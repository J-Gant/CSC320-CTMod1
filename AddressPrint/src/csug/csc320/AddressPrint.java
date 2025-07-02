package csug.csc320;

import java.util.Scanner;

public class AddressPrint {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please enter your name and address in the following format or ");
		System.out.println("Type \"q\" to quit.");
		System.out.println();
		System.out.println("first name, last name, address, city, state, zip code");

		String input = scnr.nextLine();

		while (!input.equalsIgnoreCase("q")) {
			try {
				String[] inputParts = input.trim().split("\\s*,\\s*");

				if (inputParts.length != 6) {
					throw new IllegalArgumentException(
							"Invalid format. Please enter exactly 6 comma-separated values.");
				}

				Address myAddress = new Address(inputParts[0], inputParts[1], inputParts[2], inputParts[3],
						inputParts[4], inputParts[5]);

				System.out.println();
				myAddress.printAddress();

				input = "q";
			}

			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
				System.out.println();
				input = scnr.nextLine();
				continue;
			}
		}

			if (input.equalsIgnoreCase("q")) {
				System.out.println("Goodbye");
				scnr.close();
				System.exit(0);
			}
	}
}