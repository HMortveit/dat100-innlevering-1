package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			int poengsum;

			while (true) {
				System.out.print("Skriv poengsummen din for student " + i + ": ");
				poengsum = scanner.nextInt();

				if (poengsum >= 0 && poengsum <= 100) {
					break;
				} else {
					System.out.println("Ugyldig poengsum! Vennligst skriv inn en poengsum mellom 0 og 100:");
				}
			}

			if (poengsum <= 39 && poengsum >= 0) {
				System.out.println("Karakter: F");
			} else if (poengsum >= 40 && poengsum <= 49) {
				System.out.println("Karakter: E");
			} else if (poengsum >= 50 && poengsum <= 59) {
				System.out.println("Karakter: D");
			} else if (poengsum >= 60 && poengsum <= 79) {
				System.out.println("Karakter: C");
			} else if (poengsum >= 80 && poengsum <= 89) {
				System.out.println("Karakter: B");
			} else if (poengsum >= 90 && poengsum <= 100) {
				System.out.println("Karakter: A");
			} else {

			}
		}

		scanner.close();
	}
}

