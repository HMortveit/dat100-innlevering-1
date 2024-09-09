package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Skriv inn et heltall n > 0: ");
        int n = scanner.nextInt();
        
        
        if (n <= 0) {
            System.out.println("n må være større enn 0.");
        } else {
          
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            
            System.out.println("Fakultet av " + n + " er " + factorial);
        }
        
        scanner.close();
    }

		
		
	

	}


