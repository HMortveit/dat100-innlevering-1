package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Skriv inn bruttoinntekt (i kr): ");
		double bruttoinntekt = scanner.nextDouble();

		double trinnskatt = 0.0;

		if (bruttoinntekt > 969200) {
			trinnskatt += (bruttoinntekt - 969200) * 0.162;
			bruttoinntekt = 969200;
		}

		if (bruttoinntekt > 593250) {
			trinnskatt += (bruttoinntekt - 593250) * 0.132;
			bruttoinntekt = 593250;
		}

		if (bruttoinntekt > 251550) {
			trinnskatt += (bruttoinntekt - 251550) * 0.04;
			bruttoinntekt = 251550;
		}

		if (bruttoinntekt > 208050) {
			trinnskatt += (bruttoinntekt - 208050) * 0.017;

		}
		System.out.printf("Trinnskatten du skal betale er: %.2f kr\n", trinnskatt);

		scanner.close();

	}

}
